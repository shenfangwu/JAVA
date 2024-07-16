package com.wfs.way;

/**
 * 构造器引用
 * 若某lambda表达式里只是在创建对象，且前后参数情况一致，就可以使用构造器引用
 */
public class Test1 {
    public static void main(String[] args) {
        // CreateStu cs0 = new CreateStu() {
        //    @Override
        //    public Student create(String name, double score, int age) {
        //       return new Student("wfs",100,25);
        //    }
        // };
        CreateStu cs = Student::new;
        Student student = cs.create("wfs",100,25);
        System.out.println(student);
    }
}
interface CreateStu{
    Student create(String name,double score,int age);
}