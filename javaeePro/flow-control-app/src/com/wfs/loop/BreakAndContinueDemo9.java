package com.wfs.loop;
// 跳转关键字break continue
public class BreakAndContinueDemo9 {
    public static void main(String[] args) {
        // 1 break用于跳出当前所在循环的执行、或结束所在switch分支的执行
        for (int i = 0; i < 3; i++) {
            System.out.println("i love you"+i);
            if(i == 2){
                break;
            }
        }
        // 2 continue用于跳出当前所在循环的当次执行，直接进入循环的下次执行，只能在循环中使用
        for (int i = 0; i < 3; i++) {
            System.out.println("sleep"+i);
            if(i == 2){
                continue;
            }
        }
    }
}
