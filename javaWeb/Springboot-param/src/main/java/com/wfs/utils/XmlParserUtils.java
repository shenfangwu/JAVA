package com.wfs.utils;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
/**
 * 解析XML文件为一个对象列表
 */
public class XmlParserUtils {

    public static <T> List<T> parse(String file , Class<T> targetClass)  {
        ArrayList<T> list = new ArrayList<T>(); //封装解析出来的数据
        try {
            //1.获取一个解析器对象
            SAXReader saxReader = new SAXReader();
            //2.利用解析器把xml文件加载到内存中,并返回一个文档对象
            Document document = saxReader.read(new File(file));
            //3.获取到根标签
            Element rootElement = document.getRootElement();
            //4.通过根标签来获取 所有一级<emp> 标签
            List<Element> elements = rootElement.elements("emp");

            //5.遍历集合,得到每一个 <emp> 标签
            for (Element element : elements) {
                //获取 name 属性
                String name = element.element("name").getText();
                //获取 age 属性
                String age = element.element("age").getText();
                //获取 image 属性
                String image = element.element("image").getText();
                //获取 gender 属性
                String gender = element.element("gender").getText();
                //获取 job 属性
                String job = element.element("job").getText();

                //组装数据
                // 获取此类的某个构造器
                Constructor<T> constructor = targetClass.getDeclaredConstructor(String.class,
                        Integer.class, String.class, String.class, String.class);
                // 此构造函数的可访问性
                constructor.setAccessible(true);
                // 利用此构造函数创建一个对象
                T object = constructor.newInstance(name, Integer.parseInt(age), image, gender, job);
                // 将此对象放进列表中
                list.add(object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
