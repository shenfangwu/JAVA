package com.wfs.d5_generics_class;

// 可以接收多个参数
public class YouClassArray<E,Q>{

}
// 可以限定参数
 class Animal{

}
class Dog extends Animal{

}
class OtherClassArray<E extends Animal>{// E必须是继承Animal的类型

}