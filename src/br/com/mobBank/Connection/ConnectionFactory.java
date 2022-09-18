package br.com.mobBank.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public static Connection getConnection() throws Exception {
		return DriverManager
				.getConnection("jdbc:mysql://localhost/financas?useTimezone=tru&serverTimezone=UTC", "root", "root");
	}
}
