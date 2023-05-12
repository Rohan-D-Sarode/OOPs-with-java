package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	private static Connection cn;
	
	// a staitc method to open db connection
	
	public static Connection openConnection() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/advjava?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
		cn = DriverManager.getConnection(url, "root", "root123");
		return cn;
	
	}
}
