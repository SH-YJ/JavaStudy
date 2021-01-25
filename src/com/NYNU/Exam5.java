package com.NYNU;


import java.sql.*;
import java.util.LinkedList;

public class Exam5 {
    // jabc
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/user";
            String username = "root";
            String password = "root";
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            String sql = "insert into goods(num,name,price) value('001','苹果',3.5)";
            boolean rs = stmt.execute(sql);
            if (!rs)
                System.out.println("数据插入成功！");
            else
                System.out.println("数据插入失败！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
