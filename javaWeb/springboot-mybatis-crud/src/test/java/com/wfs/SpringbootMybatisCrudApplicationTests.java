package com.wfs;

import com.wfs.mapper.EmpMapper;
import com.wfs.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringbootMybatisCurdApplicationTests {
    @Autowired
    private EmpMapper empMapper;
    // 测试删除
    @Test
    public void testDelete(){
        empMapper.delete(26);
    }
    // 测试插入
    @Test
    public void testInsert(){
        Emp emp = new Emp();
        emp.setUsername("Tom");
        emp.setName("汤姆");
        emp.setGender((short) 1);
        emp.setImage("1.jpg");
        emp.setJob((short) 2);
        emp.setEntrydate(LocalDate.of(2000,10,1));
        emp.setDeptId(2);
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.insert(emp);
        System.out.println(emp.getId());
    }
    // 测试动态更新
    @Test
    public void testUpdate2(){
        Emp emp =  new Emp();
        emp.setId(27);
        emp.setUsername("Tom1");
        emp.setName("汤姆1");
        emp.setImage("1.jpg");
        emp.setGender((short) 1);
        emp.setJob((short) 2);
        emp.setEntrydate(LocalDate.of(2000,10,1));
        emp.setDeptId(2);
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update2(emp);
    }
    // 根据id查询
    @Test
    public void testGetbyId(){
        Emp emp = empMapper.getById(7);
        System.out.println(emp);
    }
    //
    @Test
    public void testGet(){
        List<Emp>  empList = empMapper.list("张",(short)1,LocalDate.of(2010,10,1),LocalDate.of(2020,10,1));
        System.out.println(empList);
    }
    // 批量删除
    @Test
    public void deletes(){
        List<Integer> ids = new ArrayList<>();
        ids.add(14);ids.add(15);ids.add(27);
        empMapper.deleteByIds(ids);
    }
}
