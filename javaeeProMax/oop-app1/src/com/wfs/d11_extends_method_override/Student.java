package com.wfs.d11_extends_method_override;

public class Student extends People{
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    // 1 建议加上@Override注解，可以校验重写是否正确，同时可读性好
    // 2 子类重写父类方法时，访问权限必须>=父类被重写的方法权限 public>protected>缺省
    // 3 重写方法的返回值类型的范围必须<=被重写方法的返回值类型的范围
    // 4 私有方法、静态方法不能被重写
    @Override
    public String toString() {
        return "Student{name="+getName()+",age="+getAge()+",sex="+getSex()+",score="+getScore()+"}";
    }
}
