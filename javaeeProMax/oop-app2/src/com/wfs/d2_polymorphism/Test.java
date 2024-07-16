package com.wfs.d2_polymorphism;

/**
 * 使用多态的好处以及问题
 */
public class Test {
    public static void main(String[] args) {
        // 1 好处1：在多态形式下，右边对象是解耦合的，更便于扩展和维护--右边对象可以随便换
        People people = new Student();
        people.run();

        // 3 坏处1：多态下不能直接调用子类的独有方法--用强制类型转换
        // 强制类型转换可以把对象转换成真正的类型
        // 存在继承/实现时，就可以进行强制类型转换，编译阶段不会报错
        Student ss = (Student) people;
        ss.learn();// 此时再转teacher运行会报错
        // 但是运行时，如果发现对象的真实类型与强转后的类型不同会报错--利用instanceof判断真实类型
        Student s =  new Student();
        go(s);
        Teacher t = new Teacher();
        go(t);

        // people.learn() 错误
    }
    // 2 好处2：定义方法时，使用父类类型的形参，可以接收一切的子类对象，扩展性更强、更便利
    public static void go(People people){// 使用父类类型的形参，接收一切的子类对象
        if(people instanceof Student){// 利用instanceof判断真实类型
            Student student = (Student) people;
            student.learn();
        }else {
            Teacher teacher = (Teacher) people;
            teacher.teach();
        }
    }
}
