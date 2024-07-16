import com.wfs.pkg.Demo;
import com.wfs.pkg.pkgdemo2.pkgDemo1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 同一个包下的程序，可以直接访问
        Demo d = new Demo();
        d.print();
        // 2 访问其他包的程序必须导包才可以访问
        pkgDemo1 d2 = new pkgDemo1();
        d2.print();
        // 3 自己的程序调用Java提供的程序，也需要先导包才可以使用。注意Java.lang包下的程序是不需要我们导包的，可以直接使用
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        // 4 访问多个其他包下的程序，这些程序名字又一样的情况下，默认只能导入一个程序，另一个程序必须带包和类名来访问
        com.wfs.pkg.pkgdemo1.pkgDemo1 d1 = new com.wfs.pkg.pkgdemo1.pkgDemo1();
        d1.print();
    }
}