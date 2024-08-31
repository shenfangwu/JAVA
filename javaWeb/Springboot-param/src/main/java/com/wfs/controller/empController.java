package com.wfs.controller;
import com.wfs.pojo.Emp;
import com.wfs.pojo.Result;
import com.wfs.utils.XmlParserUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class empController {
    @RequestMapping("/listEmp")
    public Result list(){
        // 1获取XML文件对象:使用类加载器去加载资源文件
        String file = this.getClass().getClassLoader().
                getResource("emp.xml").getFile();
        // 2解析XML文件
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        // 3使用Stream流对集合List进行遍历并操作
        empList.stream().forEach(emp->{
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }
            String job = emp.getJob();
            if("1".equals(job)){
                emp.setJob("员工");
            }else if("2".equals(job)){
                emp.setJob("组长");
            }else if("3".equals(job)){
                emp.setJob("厂长");
            }
        });
        // 4将操作后的list由Result类统一包装并返回给前端
        return Result.success(empList);
    }
}
