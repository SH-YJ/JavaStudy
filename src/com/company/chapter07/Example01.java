package com.company.chapter07;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author SH_YJ
 * @date 2020/12/7 8:27
 */
public class Example01 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("D:/JavDB/1.md");
        FileOutputStream outputStream = new FileOutputStream(file,true);

        OutputStreamWriter writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
        writer.append("中文输入");
        writer.append("\n");
        writer.append("Enlish");
        writer.append("\n");

        writer.close();
        outputStream.close();

        FileInputStream inputStream = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(inputStream,StandardCharsets.UTF_8);

        StringBuilder sb = new StringBuilder();
        while (reader.ready()){
            sb.append((char) reader.read());
        }
        System.out.println(sb.toString());
        reader.close();
        inputStream.close();
    }
}
