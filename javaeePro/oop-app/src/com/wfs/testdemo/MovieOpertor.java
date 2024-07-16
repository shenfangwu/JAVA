package com.wfs.testdemo;

public class MovieOpertor {
    private Movie[] movies;

    public MovieOpertor(Movie[] movies) {
        this.movies = movies;
    }

    /* 1 打印所有电影信息*/
    public void printAllMovies(){
        System.out.println("------系统全部电影信息如下-------");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号： "+m.getId());
            System.out.println("名称: "+m.getName());
            System.out.println("价格: "+m.getPrice());
            System.out.println("---------------------------");
        }
    }
    /* 2 根据ID查询电影详细信息并展示*/
    public void searchMovieById(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if(m.getId()==id){
                System.out.println("编号： "+m.getId());
                System.out.println("名称: "+m.getName());
                System.out.println("价格: "+m.getPrice());
                System.out.println("---------------------------");
                return;
            }
        }
        System.out.println("没找到该编号电影！");
    }
}
