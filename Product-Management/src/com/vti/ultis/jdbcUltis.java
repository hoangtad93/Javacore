package com.vti.ultis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbcUltis {
	private Properties property;
	private Connection connection;

	public jdbcUltis() throws FileNotFoundException, IOException {
		property = new Properties();
		property.load(new FileInputStream(
				"/Users/tahoang/Desktop/VTIRAIWAY63/Javacore/DBconnect_3layer/src/com/vti/resources/database.propertis"));
	}

// kiem tra ket noi vs DB
	public void connnectionTestting() throws ClassNotFoundException, SQLException {
		String url = property.getProperty("url");
		String Username = property.getProperty("username");
		String password = property.getProperty("password");
		String dirver = property.getProperty("driver");

		Class.forName(dirver);
		connection = DriverManager.getConnection(url, Username, password); // tao ket noi
		System.out.println("Connect Success");
	}

// phuong thuc tao ket noi DB
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String url = property.getProperty("url");
		String Username = property.getProperty("username");
		String password = property.getProperty("password");
		String dirver = property.getProperty("driver");
		Class.forName(dirver);
		connection = DriverManager.getConnection(url, Username, password);
		return connection;
	}

	public void disConnection() throws SQLException {
		connection.close();
	}

// phuong thuc thuc thi cac cau lenh select trong ctrinh
	public ResultSet executeQuery(String sql) throws ClassNotFoundException, SQLException {
		Connection connnection = getConnection();
		Statement statement = connnection.createStatement(); // o ra mot cua so statement de lam viec
		ResultSet result = statement.executeQuery(sql); // thao tac chay cau lenh
		return result;
	}

// phương thức tạo ra đối tượng preparedstatement
	public PreparedStatement createPrepareStatement(String sql) throws ClassNotFoundException, SQLException {
		Connection connnection = getConnection();
		PreparedStatement preStatement = connnection.prepareStatement(sql);
		return preStatement;
	}

}
