package DAO;

import DTO.DepartamentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DepartamentoDAO {
    private Connection conn;
    public DepartamentoDAO() {
        ConnectionBD connectionBD = new ConnectionBD();
        this.conn = connectionBD.conectaBD();
    }
    // Criar
    public void adicionarDepartamento(DepartamentoDTO departamento) {
        String sql = "INSERT INTO departamentos (codigo, denominacao) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, departamento.getCodigo());
            stmt.setString(2, departamento.getDenominacao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Ler
    public DepartamentoDTO buscarDepartamento(int codigo) {
        String sql = "SELECT * FROM departamentos WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new DepartamentoDTO(rs.getInt("codigo"), rs.getString("denominacao"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    // Atualizar
    public void atualizarDepartamento(DepartamentoDTO departamento) {
        String sql = "UPDATE departamentos SET denominacao = ? WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, departamento.getDenominacao());
            stmt.setInt(2, departamento.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Deletar
    public void deletarDepartamento(int codigo) {
        String sql = "DELETE FROM departamentos WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
