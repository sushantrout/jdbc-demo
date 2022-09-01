package com.bip;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCountDemo {
	public static void main(String[] args) throws SQLException {
		String DBURL = "jdbc:postgresql://localhost:5432/un-admin";
		String USERNAME = "postgres";
		String PASSWORD = "admin";
		
		Connection connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
		
		Statement createStatement = connection.createStatement();//Prepared Statement , CallableStatement
		
		String query = "SELECT count(*) FROM employee WHERE id = 10";
		ResultSet executeQuery = createStatement.executeQuery(query);
		
		while(executeQuery.next()) {
			int int1 = executeQuery.getInt(1);
			System.out.println("Count is: " + int1);
		}
	}
}
