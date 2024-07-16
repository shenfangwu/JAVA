package com.wfs.d5_abstract;
/**
 * 抽象类的应用场景：父类知道每个子类都要做某个行为，
 * 但是每个子类要做的情况不一样，父类就定义成抽象方法，交给子类去重写实现
 * 我们抽出这样的抽象类，就是为了更好的实现
 */
public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();// 这样就不需要转换类型 以及判断真实类型了
        cat.cry();
    }
}
