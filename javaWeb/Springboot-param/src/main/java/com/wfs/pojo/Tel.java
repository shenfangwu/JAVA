package com.wfs.pojo;

public class Tel {
    private String fatherTel;
    private String motherTel;

    public Tel() {
    }

    @Override
    public String toString() {
        return "Tel{" +
                "fatherTel='" + fatherTel + '\'' +
                ", motherTel='" + motherTel + '\'' +
                '}';
    }

    public Tel(String fatherTel, String motherTel) {
        this.fatherTel = fatherTel;
        this.motherTel = motherTel;
    }

    public String getFatherTel() {
        return fatherTel;
    }

    public void setFatherTel(String fatherTel) {
        this.fatherTel = fatherTel;
    }

    public String getMotherTel() {
        return motherTel;
    }

    public void setMotherTel(String motherTel) {
        this.motherTel = motherTel;
    }
}
