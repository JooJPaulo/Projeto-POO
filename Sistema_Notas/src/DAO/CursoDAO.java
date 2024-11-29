package DAO;

import DTO.CursoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class CursoDAO {
    private Connection conn;
    public CursoDAO() {
        ConnectionBD connectionBD = new ConnectionBD();
        this.conn = connectionBD.conectaBD();
    }
    // Criar
    public void adicionarCursoDTO(CursoDTO CursoDTO) {
        String sql = "INSERT INTO CursoDTOs (codigo, nome, sigla) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, CursoDTO.getCodigo());
            stmt.setString(2, CursoDTO.getNome());
            stmt.setString(3, CursoDTO.getSigla());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Ler
    public CursoDTO buscarCursoDTO(int codigo) {
        String sql = "SELECT * FROM CursoDTOs WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new CursoDTO(rs.getInt("codigo"), rs.getString("nome"), rs.getString("sigla"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    // Atualizar
    public void atualizarCursoDTO(CursoDTO CursoDTO) {
        String sql = "UPDATE CursoDTOs SET nome = ?, sigla = ? WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, CursoDTO.getNome());
            stmt.setString(2, CursoDTO.getSigla());
            stmt.setInt(3, CursoDTO.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Deletar
    public void deletarCursoDTO(int codigo) {
        String sql = "DELETE FROM CursoDTOs WHERE codigo = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
