package com.wfs.loop;
// 循环嵌套
public class LoopNestedDemo8 {
    public static void main(String[] args) {
        // 循环嵌套：循环中又包含循环
        // 外部循环每循环一次，内部循环全部执行完一轮
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("wfs");
            }
        }
    }
}
