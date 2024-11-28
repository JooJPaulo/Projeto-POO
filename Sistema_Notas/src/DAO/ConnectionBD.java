package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConnectionBD {

	public Connection conectaBD() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/escola?user=root&pasword=Hope26/12";
			
			conn = DriverManager.getConnection(url);
		}catch(SQLException erro) {
			JOptionPane.showMessageDialog(null, "O erro está acontecendo na classe ConnectionBD " + erro.getMessage());
		}
		
		return conn;
		
	}
}
