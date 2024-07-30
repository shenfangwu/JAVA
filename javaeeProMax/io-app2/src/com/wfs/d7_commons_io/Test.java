package com.wfs.d7_commons_io;
import org.apache.commons.io.FileUtils;
import java.io.File;


public class Test {
    public static void main(String[] args) throws Exception {
        FileUtils.copyFile(new File("io-app2/src/xuliehua.txt"),new File("io-app2/src/newxuliehua.txt"));
    }
}
