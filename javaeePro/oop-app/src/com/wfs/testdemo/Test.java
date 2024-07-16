package com.wfs.testdemo;

import java.util.Scanner;

// 模仿电影信息浏览系统
public class Test {
    public static void main(String[] args) {
        /* 1 设计一个Movie类 */
        /* 2 设计一个Movie操作类 */
        /* 3 初始化电影数据 */
        Movie[] movies = new Movie[3];
        movies[0] = new Movie(1, "swim", "wfs", 100, 80, "ld", "very good");
        movies[1] = new Movie(2, "fly", "sfw", 100, 80, "dd", "very good");
        movies[2] = new Movie(3, "sing", "ld", 100, 80, "ll", "very good");

        Scanner sc = new Scanner(System.in);
        MovieOpertor mo = new MovieOpertor(movies);
        /* 4 主界面 */
        while (true) {
            System.out.println("------------电影信息系统-----------");
            System.out.println("1、查询全部电影信息");
            System.out.println("2、根据ID查询电影信息");
            System.out.println("3、退出");
            System.out.println("请输入你操作的功能！");
            int id = sc.nextInt();
            switch (id) {
                case 1:
                    mo.printAllMovies();
                    break;
                case 2:
                    System.out.println("请输入ID！");
                    int moId = sc.nextInt();
                    mo.searchMovieById(moId);
                    break;
                case 3:
                    System.out.println("---------欢迎下次光临！！----------");
                    return;
            }
        }
    }
}
