package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ConnectionBD {
    @SuppressWarnings("exports")
    public Connection conectaBD() {
        Connection conn = null;
        try {
            String url = "";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "O erro está acontecendo na classe ConnectionBD " + erro.getMessage());
        }
        return conn;
    }
}