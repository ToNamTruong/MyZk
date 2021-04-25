package datasource;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	
	private final static String databaseURL = "jdbc:ucanaccess://D://workspace//MyZK//tranning.accdb";
	
	public static Connection getConnection() {
		Connection connection =null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			try {
				connection = DriverManager.getConnection(databaseURL);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return connection;
	}
}
