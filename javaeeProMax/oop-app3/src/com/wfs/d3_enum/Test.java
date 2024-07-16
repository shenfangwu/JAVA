package com.wfs.d3_enum;
/**
 * 枚举通常用来表示一组信息、然后作为参数进行传输,更加规范
 */
public class Test {
    public static void main(String[] args) {
        check(Constant.BOY);
    }
    public static void check(Constant sex){
        switch (sex){
            case BOY:
                System.out.println("男");
                break;
            case GIRL:
                System.out.println("女");
                break;
        }
    }
}
