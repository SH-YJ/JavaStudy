package com.Study.JDBC;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.sql.*;
import java.util.Scanner;

/**
 * @author SH_YJ
 * @date 2020/12/24 16:09
 */
public class Test1 {
    public static void main(String[] args) {
        // 使用Statement执行sql语句，使用含有变量的sql语句，只能拼接语句
        // String sql1 = "update student set 邮箱='2323@qq.com' where 姓名='" + str +"';"
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/url?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
            String username = "syj";
            String password = "syj21408";
            conn = DriverManager.getConnection(url, username, password);

            String sql = "select * from student";
            String sql1 = "update student set 邮箱='123@qq.com' where 姓名= '王芳'";

            stmt = conn.createStatement();
            stmt.execute(sql);  //执行各种sql语句,返回boolean值
            stmt.executeUpdate(sql1);  // 执行sql的insert,update,delete语句，返回int值，表示受影响的记录条数

            rs = stmt.executeQuery(sql);  // 执行查询语句，返回ResultSet对象
            while (rs.next()){
                String str = rs.getString("姓名");
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
