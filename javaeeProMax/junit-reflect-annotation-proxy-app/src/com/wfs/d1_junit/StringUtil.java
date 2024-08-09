package com.wfs.d1_junit;

/**
 * 1将Junit框架的jar包导入到项目中（注意：IDEA集成了Junit框架，不需要我们自己手工导入了）
 * 2编写测试类、测试类方法（注意：测试方法必须是公共的，无参数，无返回值的非静态方法）
 * 3必须在测试方法上使用@Test注解（标注该方法是一个测试方法）
 * 4在测试方法中，编写程序调用被测试的方法即可。
 * 5选中测试方法，右键选择“JUnit运行” ，如果测试通过则是绿色；如果测试失败，则是红色
 */
public class StringUtil {
    public static void printNumber(String name){

        System.out.println("名字长度是："+name.length()
        );
    }

    /**
     * 求字符串的最大索引
     */
    public static int getMaxIndex(String data){
        if(data == null){
            return -1;
        }
        return data.length();
    }
}
