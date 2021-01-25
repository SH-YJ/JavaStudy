package com.Study.JDBC;

import java.sql.*;
import java.util.Scanner;

/**
 * @author SH_YJ
 * @date 2020/12/25 8:52
 */
public class Test2 {
    public static void main(String[] args) {
        // 使用 PrepareStatement ，预编译，使用占位符 ? 代替其他参数，然后通过setXxx()执行sql语句中的变量
        ResultSet rs = null;
        Connection conn = null;
        PreparedStatement prestmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/url?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
            String username = "syj";
            String password = "syj21408";
            conn = DriverManager.getConnection(url, username, password);

            String sql1 = "update student set 邮箱='2632@163.com' where 姓名= ?";
            String sql2 = "select * from student;";
            Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();

            prestmt  = conn.prepareStatement(sql1);
            prestmt.setString(1,str1);  // 第一个问号就是1，依次类推
            prestmt.executeUpdate();  // 执行sql语句，该语句必须是DML语句或者无返回的SQL语句

            rs = prestmt.executeQuery(sql2);  // 执行查询语句，返回ResultSet对象
            while (rs.next()){
                String str = rs.getString(1);
                System.out.println(str);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
