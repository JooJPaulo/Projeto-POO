package DAO;

import DTO.ProfessorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ProfessorDAO {
    private Connection conn;
    public ProfessorDAO() {
        ConnectionBD connectionBD = new ConnectionBD();
        this.conn = connectionBD.conectaBD();
    }
    // Criar
    public void adicionarProfessor(ProfessorDTO professor) {
        String sql = "INSERT INTO professores (codigo, nome, formacao, endereco, telefone, senha) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, professor.getCodigo());
            stmt.setString(2, professor.getNome());
            stmt.setString(3, professor.getFormacao());
            stmt.setString(4, professor.getEndereco());
            stmt.setString(5, professor.getTelefone());
            stmt.setString(6, professor.getSenha()); // Adicionando o campo senha
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Ler
    public ProfessorDTO buscarProfessor(int codigo) {
        String sql = "SELECT * FROM professores WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new ProfessorDTO(
                    rs.getInt("codigo"),
                    rs.getString("nome"),
                    rs.getString("formacao"),
                    rs.getString("endereco"),
                    rs.getString("telefone"),
                    rs.getString("senha") // Lendo a senha do banco de dados
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    // Atualizar
    public void atualizarProfessor(ProfessorDTO professor) {
        String sql = "UPDATE professores SET nome = ?, formacao = ?, endereco = ?, telefone = ?, senha = ? WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getFormacao());
            stmt.setString(3, professor.getEndereco());
            stmt.setString(4, professor.getTelefone());
            stmt.setString(5, professor.getSenha()); // Atualizando a senha
            stmt.setInt(6, professor.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Deletar
    public void deletarProfessor(int codigo) {
        String sql = "DELETE FROM professores WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}