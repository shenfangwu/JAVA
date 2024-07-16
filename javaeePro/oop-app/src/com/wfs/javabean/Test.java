package com.wfs.javabean;
import com.wfs.javabean.Student;
// 学习实体类：1成员变量必须私有且为他们提供get set方法，必须有无参数构造器
// 1 用于保存数据的java类，可以用它创建对象，保存某个事物的数据
// 2 场景：数据和数据的业务处理相分离
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setScore(77);
        s1.setName("ld");
        StudentOperator sq = new StudentOperator(s1);
        sq.printStudent();
    }
}
