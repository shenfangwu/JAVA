package com.wfs.testdemo;

public class Movie {
    private int id;
    private String name;
    private String director;
    private double price;
    private double score;
    private String actor;
    private String info;
    public Movie(){

    }
    public Movie(int id, String name, String director, double price, double score, String actor, String info) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.price = price;
        this.score = score;
        this.actor = actor;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
