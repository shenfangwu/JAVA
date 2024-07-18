package com.wfs.d3_exception;

/**
 * 自定义异常：自己定义异常管理问题
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            saveAge(110);
            saveAge2(110);
        }catch (Exception e){
            System.out.println("报错！");
        }
    }
    public static void saveAge(int age) throws AgeIllegalRuntimeException {
        if(age>0 && age < 150){
            System.out.println("年龄已保存 "+age);;
        }else {
            // 生成一个新对象
            // throw 抛出这个异常对象
            throw new AgeIllegalRuntimeException("/age is illegal,your age is "+age);
        }
    }
    public static void saveAge2(int age) throws AgeIllegalException {
        if(age>0 && age < 100){
            System.out.println("年龄已保存 "+age);;
        }else {
            // 生成一个新对象
            // throw 抛出这个异常对象
            throw new AgeIllegalException("/age is illegal,your age is "+age);
        }
    }
}
