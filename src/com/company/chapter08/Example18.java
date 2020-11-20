package com.company.chapter08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 中文乱码 -> Run -> edit configurations -> VM options -> 添加 -Dfile.encoding=gbk

/**
 * @author SH_YJ
 * @date 2020/11/20 8:13
 */
public class Example18 extends JFrame {
    JButton sendBt;
    JTextArea chatContent;
    JTextField inputFiled;

    public Example18() {
        this.setLayout(new BorderLayout());
        chatContent = new JTextArea(12, 34);  // 创建一个文本域
        // 创建一个滚动面板，将文本域作为其显示组件
        JScrollPane scrollPane = new JScrollPane(chatContent);
        JPanel inputPanel = new JPanel();
        inputFiled = new JTextField(20);
        sendBt = new JButton("发送");
        sendBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = inputFiled.getText();
                if (content != null && !content.trim().equals("")) {
                    chatContent.append("本人：" + content + "\n");
                } else {
                    chatContent.append("聊天信息不能为空" + "\n");
                }
                inputFiled.setText("");
            }
        });
        Label label = new Label("聊天信息");
        inputPanel.add(label);
        inputPanel.add(inputFiled);
        inputPanel.add(sendBt);
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(inputPanel, BorderLayout.SOUTH);
        this.setTitle("聊天窗口");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Example18();
    }
}
