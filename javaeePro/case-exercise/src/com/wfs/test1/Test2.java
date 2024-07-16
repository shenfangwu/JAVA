package com.wfs.test1;

import java.util.Random;

// 开发验证码
// 开发一个程序，可以生成指定位数的验证码，每位可以是数字、大小写字母。
// 1方法接收数据、返回数据
// 2for循环生成随机字符，使用String变量来接收
public class Test2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            String code = createCode(4);
            System.out.println(code);
        }
    }
    public static String createCode(int num){
        String code = " ";
        for (int i = 0; i < num; i++) {
            Random r = new Random();
            int n = r.nextInt(3);
            switch (n){
                case 0:// 随机数字
                    code+=r.nextInt(10);
                    break;
                case 1:// 随机大写字符
                    char ch1 = (char) (r.nextInt(26)+65);
                    code += ch1;
                    break;
                case 2:// 随机小写字符
                    char ch2 = (char) (r.nextInt(26)+97);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
