package com.wfs.d5_proxy2;
/**
 * 用户业务接口
 */
public interface UserService {
    void login(String loginName,String password) throws Exception;
    void deleteUsers() throws Exception;
    String[] selectUsers() throws Exception;
}
