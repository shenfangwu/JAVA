package com.wfs.quickstart;

public class Test {
    public static void main(String[]  args) {
        Student s1 = new Student();
        s1.name = "wfs";
        s1.math = 100;
        s1.chinese = 100;
        s1.printTotalScore();
        s1.printAverageScore();
    }
}
