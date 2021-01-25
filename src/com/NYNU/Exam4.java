package com.NYNU;

/**
 * @author SH_YJ
 * @date 2020/12/28 13:34
 */

import javax.swing.*;

public class Exam4 {
    // swing
    public static void main(String[] args) {
        JFrame jf = new JFrame("用户登录");
        JPanel j1 = new JPanel();
        JPanel j2 = new JPanel();

        JLabel jl1 = new JLabel("用户名：");
        JLabel jl2 = new JLabel("密码：");
        JTextField jb1 = new JTextField(20);
        JTextField jb2 = new JTextField(20);
        j1.add(jl1);
        j1.add(jb1);
        j1.add(jl2);
        j1.add(jb2);
        JButton b1 =new JButton("登录");
        JButton b2 =new JButton("取消");
        j2.add(b1);
        j2.add(b2);

        jf.add(j1);
        jf.add(j2,"South");
        jf.setSize(600,600);
        jf.setVisible(true);
    }

}
