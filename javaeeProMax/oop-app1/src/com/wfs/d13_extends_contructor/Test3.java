package com.wfs.d13_extends_contructor;

/**
 * 子类构造器的应用场景：为对象中包含父类这部分的成员变量进行赋值
 */
class People {
    private String name;
    private int age;

    public People() {

    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Teacher extends People {
    private String skill;

    public Teacher() {
    }
    // 1 子类构造器可以通过调用父类构造器，把对象中包含父类这部分的数据先初始化赋值，
    // 再回来把对象里包含子类这部分数据也进行初始化赋值
    public Teacher(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }
    // 2 this(...)调用兄弟构造器
    // 任意类的构造器中，是可以通过this(...)去调用该类的其他构造器的
    public Teacher(String name, int age) {
        // 3 this和super都要放在构造器的第一行，因此这俩冲突，不可以放在一起
        this(name,age,"C++");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "skill='" + skill + '\'' +
                '}';
    }
}

public class Test3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("wfs",19,"Java");
        Teacher teacher1 = new Teacher("ld",11);
        System.out.println(teacher);
        System.out.println(teacher1);
    }

}
