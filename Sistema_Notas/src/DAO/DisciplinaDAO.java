package DAO;

import DTO.DisciplinaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DisciplinaDAO {
    private Connection conn;
    public DisciplinaDAO() {
        ConnectionBD connectionBD = new ConnectionBD();
        this.conn = connectionBD.conectaBD();
    }
    // Criar
    public void adicionarDisciplina(DisciplinaDTO disciplina) {
        String sql = "INSERT INTO disciplinas (codigo, denominacao, sigla, ementa) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, disciplina.getCodigo());
            stmt.setString(2, disciplina.getDenominacao());
            stmt.setString(3, disciplina.getSigla());
            stmt.setString(4, disciplina.getEmenta());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Ler
    public DisciplinaDTO buscarDisciplina(int codigo) {
        String sql = "SELECT * FROM disciplinas WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new DisciplinaDTO(rs.getInt("codigo"), rs.getString("denominacao"), rs.getString("sigla"), rs.getString("ementa"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    // Atualizar
    public void atualizarDisciplina(DisciplinaDTO disciplina) {
        String sql = "UPDATE disciplinas SET denominacao = ?, sigla = ?, ementa = ? WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, disciplina.getDenominacao());
            stmt.setString(2, disciplina.getSigla());
            stmt.setString(3, disciplina.getEmenta());
            stmt.setInt(4, disciplina.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Deletar
    public void deletarDisciplina(int codigo) {
        String sql = "DELETE FROM disciplinas WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
