package com.softserve.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ApplDB {
	private static Connection con = null;
	private static String username = "devops";
	private static String password = "DevOps_553";
	private static String URL = "jdbc:mysql://192.168.153.134:3306/company2";

	public static void main(String[] args) throws SQLException {
		System.out.println("Start...");
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		con = DriverManager.getConnection(URL, username, password);
		if (con != null) {
			System.out.println("Connection Successful! \n");
		} else {
			System.out.println("Connection ERROR \n");
			System.exit(1);
		}
		Statement st = con.createStatement();
		System.out.println("con.getAutoCommit() = " + con.getAutoCommit());
		/*-
		st.execute("CREATE DATABASE lv61301;");
		st.execute("use lv61301");
		String query = "CREATE TABLE temp "
			+ "( id int unsigned not null auto_increment primary key, "
			+ "name varchar(20), "
			+ "login varchar(20), "
			+ "password varchar(30), "
			+ "age int );";
		st.execute(query);
		query = "INSERT INTO temp (name,login,password,age) VALUES ('Ivan','iva','qwerty',21);";
		st.execute(query);
		*/
		//
		//String query = "INSERT INTO temp (name,login,password,age) VALUES ('Ivan','iva','qwerty',21);";
		//String query = "INSERT INTO temp (name,login,password,age) VALUES ('Petro2','pet','123456',22);";
		//st.execute(query);
		//
		//st.execute("UPDATE temp SET name='Taras' WHERE login LIKE 'iv%';");
		//st.execute("DELETE FROM temp WHERE password='qwerty';");
		//
		ResultSet rs = st.executeQuery("select * from temp;");
		int columnCount = rs.getMetaData().getColumnCount();
		// Resultset.getMetaData () get the information
		for (int i = 1; i <= columnCount; i++) {
			System.out.print(rs.getMetaData().getColumnName(i) + "\t");
		}
		System.out.println();
		// output file
		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rs.getString(i) + "\t");
			}
			System.out.println();
		}
		System.out.println("before close");
		if (rs != null) {
			rs.close();
		}
		if (st != null) {
			st.close();
		}
		if (con != null) {
			con.close();
		}
		System.out.println("DONE");
	}
}