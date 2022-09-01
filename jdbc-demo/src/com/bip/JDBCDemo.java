package com.bip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) throws SQLException {
		String DBURL = "jdbc:postgresql://localhost:5432/un-admin";
		String USERNAME = "postgres";
		String PASSWORD = "admin";
		
		Connection connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
		
		Statement createStatement = connection.createStatement();
		
		String query = "SELECT *FROM employee";
		ResultSet executeQuery = createStatement.executeQuery(query);
		
		while(executeQuery.next()) {
			int int1 = executeQuery.getInt(1);
			String string = executeQuery.getString(2);
			System.out.println(int1 +" \t "+ string);
		}
	}
}
