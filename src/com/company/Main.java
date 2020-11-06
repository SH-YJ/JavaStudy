package com.company;
import java.sql.*;

public class Main {
	public static void main(String[] args) {
			Statement stmt = null;
			ResultSet rs = null;
			Connection conn = null;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/url?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
				String username = "syj";
				String password = "syj21408";
				conn = DriverManager.getConnection(url, username, password);
				stmt = conn.createStatement();
				String sql = "select * from 森萝财团 ";
				rs = stmt.executeQuery(sql);
				while (rs.next()){
					String surl = rs.getString("名称");
					System.out.println(surl);
				}
			}catch (Exception e){
				e.printStackTrace();
			}finally {
				if (rs != null){
					try {
						rs.close();
					}catch (SQLException e){
						e.printStackTrace();
					}
					rs = null;
				}
				if (stmt != null){
					try {
						stmt.close();
					}catch (SQLException e){
						e.printStackTrace();
					}
					stmt = null;
				}if (conn != null){
					try {
						conn.close();
					}catch (SQLException e){
						e.printStackTrace();
					}
					conn = null;
				}
			}
	}
}