package com.wfs.d9_modifer;

import com.wfs.d8_modifer.Father;

public class Son extends Father {
    // 3 任意包下的子类里
    public void test(){
        publicMethod();
        protectedMethod();
    }
}
