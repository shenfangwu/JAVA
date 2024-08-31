package com.wfs.service;

import com.wfs.pojo.Emp;

import java.util.List;

/**
 * service：业务逻辑层，处理具体的业务逻辑。
 */
public interface empService {

    public List<Emp> listEmp();
}
