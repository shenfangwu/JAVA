package com.wfs.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * 案例 ：创建集合存储电影
 * 集合存储的是元素对象的地址
 */
public class Test4 {
    public static void main(String[] args) {
        Collection<Movie> movieCollection = new ArrayList<>();
        movieCollection.add(new Movie("凡人修仙传",100,"韩立、李飞宇"));
        movieCollection.add(new Movie("洛洛历险记",100,"洛洛"));
        movieCollection.add(new Movie("驯龙高手",100,"wfs"));
        movieCollection.forEach(new Consumer<Movie>() {
            @Override
            public void accept(Movie movie) {
                System.out.print(movie.getName()+" ");
                System.out.print(movie.getScore()+" ");
                System.out.println(movie.getActor());
            }
        });
    }

}

