package com.wfs.Dao.impl;

import com.wfs.Dao.empDao;
import com.wfs.pojo.Emp;
import com.wfs.utils.XmlParserUtils;

import java.util.List;

public class empDaoA implements empDao {
    /**
     * 解析XML文件
     * @return返回对象list
     */
    @Override
    public List<Emp> listEmp() {
        // 1获取XML文件对象:使用类加载器去加载资源文件
        String file = this.getClass().getClassLoader().
                getResource("emp.xml").getFile();
        // 2解析XML文件
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
