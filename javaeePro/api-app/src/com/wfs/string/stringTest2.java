package com.wfs.string;

import java.util.Scanner;

/*              系统正确的登录名和密码是：itheima/123456，
                请在控制台开发一个登录界面，接收用户输入的登录名和密码，
                判断用户是否登录成功，登录成功后展示：“欢迎进入系统!”，
                即可停止程序（注意：要求最多给用户三次登录机会）
                */
public class stringTest2 {
    public static void main(String[] args) {
        for (int cnt = 0; cnt <3;cnt++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入登录账号~~");
            String zhanghao = sc.next();
            System.out.println("请输入登录密码~~");
            String mima = sc.next();
            Boolean res = login(zhanghao,mima);
            if(res){
                System.out.println("登录成功~");
                break;
            }else {
                System.out.println("用户名或者密码错误，请重试~还有"+(2-cnt)+"次机会！");
            }
        }
    }
    public static boolean login(String loginName,String loginSecret){
        String myLoginName = "itheima";
        String myLoginSecret = "123456";
        if(loginName.equals(myLoginName)&&loginSecret.equals(myLoginSecret)){
            return true;
        }
        return false;
    }
}
