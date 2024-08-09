package com.wfs.d1_junit;

import org.junit.*;

public class StringUtilTest {
    //  用来修饰一个静态方法，该方法会在所有测试方法之前只执行一次。
    @BeforeClass
    public static void test4() {
        System.out.println("---这是静态Before---");
    }
    // 用来修饰一个静态方法，该方法会在所有测试方法之后只执行一次。
    @AfterClass
    public static void test3() {
        System.out.println("---这是静态After---");
    }

    // 用来修饰一个实例方法，该方法会在每一个测试方法执行之前执行一次。
    @Before
    public void test0() {
        System.out.println("---这是Before---");
    }

    @Test
    public void testPrintNumber() {
        StringUtil.printNumber("wfs");
    }

    @Test
    public void testGetMaxIndex() {
        int aws = StringUtil.getMaxIndex("index");
        // 断言机制，可以通过预测业务方法的结果
        Assert.assertEquals("内部有bug", 5, aws);
    }

    // 用来修饰一个实例方法，该方法会在每一个测试方法执行之后执行一次。
    @After
    public void test1() {
        System.out.println("---这是After---");
    }
}
