package com.wfs.d7_extends_application;
/**
 * 继承的好处是啥?--减少了代码的重复编写，提高代码的复用性
 */
public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("wfs");
        teacher.setSkills("JAVA");
        teacher.printInfo();
    }
}
