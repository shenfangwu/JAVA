package com.wfs.d7_extends_application;

public class Teacher extends People{
    private String skills;

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
    public void printInfo(){
        System.out.println(getName()+"老师会的技能是："+getSkills());
    }
}
