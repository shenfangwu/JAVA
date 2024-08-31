package com.wfs.d2_xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * 读取XML文件数据
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 1 创建一个Dom4J框架提供的解析器对象
        SAXReader saxReader = new SAXReader();
        // 2 使用saxReader对象把需要解析的XML文件读成一个Document对象
        Document document = saxReader.read("properties-xml-log-app/src/student.xml");
        // 3 从文档对象中解析xml文件的根元素
        System.out.println("=========1 遍历元素============");
        Element root = document.getRootElement();
        System.out.println("根元素："+root.getName());
        // 4 获取根元素下的全部一级子元素
        List<Element> elements = root.elements();
        for (Element element : elements) {
            System.out.print("遍历一级子元素：");
            System.out.println(element.getName());
            List<Element> e = element.elements();
            System.out.print("\t遍历二级子元素：");
            for (Element element1 : e) {
                System.out.print(element1.getName()+"\t");
            }
            System.out.println();
        }
        System.out.println("=========2 获取元素属性信息============");
        // 5 获取当前元素下的指定子元素
        System.out.print("获取当前元素下的指定子元素:");
        Element student = root.element("student");
        System.out.println(student.elementText("name"));
        // 6 获取元素的属性信息
        System.out.println(student.attributeValue("id"));
        Attribute id = student.attribute("id");
        System.out.println(id.getName());// 获取名
        System.out.println(id.getValue());// 获取值
        System.out.println("遍历获取元素的指定属性信息:");
        List<Attribute> attributes = student.attributes();
        for (Attribute attribute : attributes) {
            System.out.println(attribute.getName()+"="+attribute.getValue());
        }
        // 获取指定元素名字的值
        System.out.println("获取指定元素名字的值");
        System.out.println(student.elementText("name"));
        System.out.println(student.elementText("score"));
    }
}
