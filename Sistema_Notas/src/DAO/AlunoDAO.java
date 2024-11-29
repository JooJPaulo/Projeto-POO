package DAO;

import DTO.AlunoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AlunoDAO {
    private Connection conn;
    public AlunoDAO() {
        ConnectionBD connectionBD = new ConnectionBD();
        this.conn = connectionBD.conectaBD();
    }
    // Criar
    public void adicionarAluno(AlunoDTO Aluno) {
        String sql = "INSERT INTO Alunos (matricula, nome, endereco, telefone, responsavel, data_nascimento, senha) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, Aluno.getMatricula());
            stmt.setString(2, Aluno.getNome());
            stmt.setString(3, Aluno.getEndereco());
            stmt.setString(4, Aluno.getTelefone());
            stmt.setString(5, Aluno.getresponsavel());
            stmt.setDate(6, new java.sql.Date(Aluno.getDataNascimento().getTime())); 
            stmt.setString(7, Aluno.getSenha()); // Adicionando senha ao banco de dados
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Ler
    public AlunoDTO buscarAluno(int matricula) {
        String sql = "SELECT * FROM Alunos WHERE matricula = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, matricula);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new AlunoDTO(
                    rs.getInt("matricula"),
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("telefone"),
                    rs.getString("responsavel"),
                    rs.getDate("data_nascimento"),
                    rs.getString("senha") // Lendo a senha do banco de dados
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    // Atualizar
    public void atualizarAluno(AlunoDTO Aluno) {
        String sql = "UPDATE Alunos SET nome = ?, endereco = ?, telefone = ?, responsavel = ?, data_nascimento = ?, senha = ? WHERE matricula = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, Aluno.getNome());
            stmt.setString(2, Aluno.getEndereco());
            stmt.setString(3, Aluno.getTelefone());
            stmt.setString(4, Aluno.getresponsavel());
            stmt.setDate(5, new java.sql.Date(Aluno.getDataNascimento().getTime()));
            stmt.setString(6, Aluno.getSenha()); // Atualizando a senha
            stmt.setInt(7, Aluno.getMatricula());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Deletar
    public void deletarAluno(int matricula) {
        String sql = "DELETE FROM Alunos WHERE matricula = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, matricula);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}