package com.company.chapter08;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author SH_YJ
 * @date 2020/11/13 8:11
 */
public class Example06 {
    public static void main(String[] args) {
        Frame f = new Frame("卡片布局窗口");
        f.setSize(600,400);
        f.setLocation(300,400);
        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("打开");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("关闭");
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        CardLayout c = new CardLayout();
        Panel content = new Panel();
        Panel control = new Panel();
        Button btn1 = new Button("Card1");
        Button btn2 = new Button("Card2");
        btn1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        control.add(btn1);
        control.add(btn2);
        Label l1 = new Label("这是一个卡片",Label.CENTER);
        Label l2 = new Label("这是一个卡片",Label.LEFT);
        content.setLayout(c);
        content.add(l1);
        content.add(l2);
        f.add(control,"North");
        f.add(content);
        f.setVisible(true);
    }
}