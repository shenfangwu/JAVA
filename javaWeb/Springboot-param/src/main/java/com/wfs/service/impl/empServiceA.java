package com.wfs.service.impl;

import com.wfs.Dao.empDao;
import com.wfs.pojo.Emp;
import com.wfs.service.empService;

import java.util.List;

// @Component 注释掉的话 IOC就会依赖注入切换为另一个类了
public class empServiceA implements empService {
    // @Autowired
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
        return empList;
    }
}
