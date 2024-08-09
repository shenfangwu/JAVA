package com.wfs.d5_proxy2;
/**
 * 用户业务类
 */
public class UserServicelmpl implements UserService{

    @Override
    public void login(String loginName, String password) throws Exception {
        if("admin".equals(loginName)&&"123456".equals(password)){
            System.out.println("登录成功~");
        }else {
            System.out.println("登录失败~");
        }
        Thread.sleep(100);
    }

    @Override
    public void deleteUsers() throws Exception {
        System.out.println("成功删除100000用户！");
        Thread.sleep(1000);
    }

    @Override
    public String[] selectUsers() throws Exception {
        System.out.println("查询3用户");
        String names[] = {"wfs","qf","jsc"};
        Thread.sleep(1000);

        return names;
    }
}
