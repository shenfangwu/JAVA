package com.wfs.Dao;

import com.wfs.pojo.Emp;

import java.util.List;

/**
 * dao：数据访问层(Data Access Object)（持久层），负责数据访问操作，包括数据的增、删、改、查。
 */
public interface empDao {
    public List<Emp> listEmp();
}
