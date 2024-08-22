public class Test {
    // 在同一套生命周期中，当运行后面的阶段时，前面的阶段都会运行。
    @org.junit.Test
    public void test1(){
        System.out.println("TEST1");
    }
    @org.junit.Test
    public void test2(){
        System.out.println("TEST2");
    }
    @org.junit.Test
    public void test3(){
        System.out.println("TEST3");
    }
}
