package com.NYNU;

/**
 * @author SH_YJ
 * @date 2020/12/28 13:25
 */
public class Examination2 {
    // 身份证鉴别男女
    public static void main(String[] args) {
        String idcard = "412901198008093084";
        String sex_num = idcard.substring(16,17);
        int odd = Integer.parseInt(sex_num) % 2;
        if (odd ==0)
            System.out.println("是女生！");
        else
            System.out.println("是男生！");
    }
}
