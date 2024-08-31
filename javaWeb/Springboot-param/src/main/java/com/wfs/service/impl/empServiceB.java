package com.wfs.service.impl;

import com.wfs.Dao.empDao;
import com.wfs.pojo.Emp;
import com.wfs.service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service// 将当前类交给IOC容器管理，成为IOC容器的bean,Service标注在业务类上
public class empServiceB implements empService {
    @Autowired// 运行时，IOC容器会提供该类型的bean对象，并赋值给该变量--依赖注入
    private empDao empDao;
    // private empDao empDao = new empDaoA();

    /**
     * 从Dao层获取对象列表，并对该列表进行操作。
     * @return 经过操作后的对象列表
     */
    @Override
    public List<Emp> listEmp() {
        List<Emp> empList = empDao.listEmp();
        // 3使用Stream流对集合List进行遍历并操作
        empList.stream().forEach(emp->{
            String gender = emp.getGender();
            if("1".equals(gender)){
                emp.setGender("男性");
            } else if ("2".equals(gender)) {
                emp.setGender("女性");
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
        return empList;
    }
}
