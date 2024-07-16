package com.wfs.d9_api;

import java.util.Arrays;

// 继承了Cloneable，就告诉虚拟机 我这个类有克隆能力
public class User implements Cloneable{
    private String name;
    private String password;
    private int[] codes;

   /* @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", codes=" + Arrays.toString(codes) +
                '}';
    }*/
   // 3 默认是浅拷贝 重写成深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User newUser = (User) super.clone();
        // 将数组再次浅拷贝一下--在堆区开辟一个新的对象
        newUser.codes = newUser.codes.clone();
        return newUser;
    }

    public User() {
    }

    public User(String name, String password, int[] codes) {
        this.name = name;
        this.password = password;
        this.codes = codes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int[] getCodes() {
        return codes;
    }

    public void setCodes(int[] codes) {
        this.codes = codes;
    }
}
