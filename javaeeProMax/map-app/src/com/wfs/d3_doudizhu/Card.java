package com.wfs.d3_doudizhu;

public class Card {
    private String color;
    private String num;
    private int size;

    @Override
    public String toString() {
        return num + color ;
    }

    public Card() {
    }

    public Card(String color, String num, int size) {
        this.color = color;
        this.num = num;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
