package com.wfs.define;
// 方法注意事项
public class MethodProblemDemo3 {
    // 无返回值的方法---只能直接调用
    public static void main(String[] args) {
        int rs = sum(1,2);
    }
    //1 方法在类中的先后位置无所谓，但是方法不能定义在另一个方法里面
    // 对于有返回值的函数：a可以定义变量接收结果 b直接输出调用 c直接调用
    // 返回的数据类型要一致
    public static int sum(int a,int b){
        int c = a + b;
        return c;// 2return语句下面，不能编写代码，属于无效代码不会执行的
    }
}

