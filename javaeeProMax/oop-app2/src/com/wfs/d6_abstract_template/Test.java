package com.wfs.d6_abstract_template;
/**
 * 模板方法设计模式：解决方法中存在重复代码的问题
 */
public class Test {
    public static void main(String[] args) {
        // 1 定义一个抽象类
        // 2 里面定义两个方法，一个是模板方法：放相同的代码，一个是抽象方法：具体实现交给子类完成
        // 3 模板方法建议使用final修饰，这样防止被子类重写
        Student student = new Student();
        student.write();
    }
}
