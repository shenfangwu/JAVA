package com.wfs.test1;
/*数组加密
某系统的数字密码是一个四位数，如1983，为了安全，需要加密后再传输，加密规则是：
对密码中的每位数，都加5,再对10求余，最后将所有数字顺序反转，得到一串加密后的新数，请设计出满足本需求的加密程序
 */
public class Test4 {
    public static void main(String[] args) {
        int num = 1987;
        int[] res = split(1983);
        String str = "";
        for (int i = 0; i < res.length; i++) {
            str+=res[i];
        }
        System.out.println(str);
    }
    //1 拼接+处理
    public static int[] split(int num){
        int[] numbers = new int[4];
        numbers[0] = num/1000;
        numbers[1] = (num/100)%10;
        numbers[2] = (num/10)%10;
        numbers[3] = num%10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (numbers[i]+5)%10;
        }
        reserve(numbers);
        return  numbers;
    }
    //2 反转
    public static void reserve(int[] arr){
        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
            int temp = arr[j];
            arr[j]= arr[i];
            arr[i] = temp;
        }
    }
}
