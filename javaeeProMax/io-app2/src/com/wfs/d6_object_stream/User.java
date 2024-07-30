package com.wfs.d6_object_stream;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    // 1 transient 声明的变量可以不参与序列化
    private transient String psd;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", psd='" + psd + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }
}
