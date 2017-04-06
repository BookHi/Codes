package com.bookhi.utils;
import java.sql.*;
public class DBBean 
{
	private String driverStr = "com.mysql.jdbc.Driver";
	private String connStr = "jdbc:mysql://localhost:3306/bookhi";
	private String user = "root";
	private String password = "591920317";
	private Connection conn = null;
	private Statement stmt = null;
	private static DBBean dbbean;
	public static DBBean getInstance() {
		if (dbbean == null) {
			dbbean = new DBBean();
		}
		return dbbean;
	}
	public DBBean() 
	{
		try {
			Class.forName(driverStr);
			conn = DriverManager.getConnection(connStr,user,password);
			//stmt = conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void setDriverStr(String dstr)
	{
		driverStr=dstr;
	}
	public void setConnStr(String cstr)
	{
		connStr=cstr;
	}
	public void setUser(String user)
	{
		this.user = user;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public ResultSet executeQuery(String sql) 
	{
		ResultSet rs = null;
		try {
			//conn = DriverManager.getConnection(connStr,user,password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} 
		catch(SQLException ex) { 
			System.out.println(ex.getMessage());
		}
		return rs;
	}
	public int executeUpdate(String sql)
	{
		int result=0;
		try{
			//conn = DriverManager.getConnection(connStr,user,password);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		}
		catch(SQLException ex){
			System.out.println(ex.getMessage());
		}
		return result;
	}
	public void close()
	{
		try{
			stmt.close();
			conn.close();
			System.out.println("连接已关闭");
		}
		catch(SQLException ex){
			System.out.println(ex.getMessage());
		}
	}
}

