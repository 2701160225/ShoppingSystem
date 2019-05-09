package com.work.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



public class DBUtil {
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3306/cgxt?characterEncoding=utf8&useSSL=true";
	private static final String user="root";
	
	private static final String password="wzm8454291";
	
	public static Connection getConnection() throws Exception {
		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);
	}
	private static void bindParams(PreparedStatement pst, List<Object> sqlParams) {
		for (int i = 0; i < sqlParams.size(); i++) {
			try {
				pst.setObject(i + 1, sqlParams.get(i));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static ResultSet executeQuery(String sql,List<Object> sqlParams) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = DBUtil.getConnection().prepareStatement(sql);	
			if(sqlParams != null && sqlParams.size() > 0) {
				DBUtil.bindParams(pstmt,sqlParams);
			}
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rs;
	}
	
	public static int executeUpdate(String sql, List<Object> sqlParams) throws Exception{
		int i = 0;
		Connection con = DBUtil.getConnection();
		PreparedStatement pstmt = null;
		pstmt = con.prepareStatement(sql);
		if(sqlParams != null && sqlParams.size() > 0) {
			DBUtil.bindParams(pstmt,sqlParams);
		}
		i = pstmt.executeUpdate();
		DBUtil.close(null, pstmt, con);
		return i;
	}
	
	public static void close(ResultSet rs,PreparedStatement pstmt,
			Connection con)throws Exception {
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(con != null) con.close();
	}
}
