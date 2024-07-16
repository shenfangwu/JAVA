package com.wfs;

import java.nio.file.attribute.AttributeView;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Atm {
    Scanner sc = new Scanner(System.in);
    private ArrayList<Account> accountArrayList = new ArrayList<>();
    private Account loginAcc;

    /**
     * 启动ATM系统页面 欢迎界面
     */
    public void start() {
        while (true) {
            System.out.println("===欢迎进入ATM系统===");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择： ");
            int cmd = sc.nextInt();
            switch (cmd) {
                case 1:
                    // 用户登录
                    login();
                    break;
                case 2:
                    // 用户开户
                    createAccount();
                    break;
                default:
                    System.out.println("没有该操作~~");
            }
        }
    }

    /**
     * 完成用户登录功能
     */
    private void login() {
        // 1 如果系统没有账户对象，则不允许登录
        if (accountArrayList.size() == 0) {
            System.out.println("ATM系统无账号");
            return;
        }
        // 2 让用户输入登录的卡号，先判断卡号是否正确，如不正确要给出提示
        while (true) {
            System.out.println("请输入您的登录卡号：");
            String cardId = sc.next();
            // 卡号是否存在
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {// 卡号不存在
                System.out.println("您输入登录卡号不存在，请确认~");
            } else {
                // 3 如卡号正确，再让用户输入账户密码，若密码不正确要给出提示，若密码也正确，则给出登录成功的提示
                while (true) {
                    System.out.print("输入您的登录密码~：");
                    String passWord = sc.next();
                    if (acc.getPassWord().equals(passWord)) {
                        // 进入用户操作页面
                        System.out.println("恭喜您" + acc.getUserName() + "成功登录了系统，您的卡号是：" + acc.getCardId());
                        loginAcc = acc;
                        showUserCommand();
                        return;// 跳出循环并结束当前登录方法
                    } else {
                        System.out.println("您输入的密码不正确，请确认~~");
                    }
                }
            }
        }

    }

    /**
     * 展示登录后的操作界面
     */
    private void showUserCommand() {
        while (true) {
            System.out.println(loginAcc.getUserName() + "您可以选择如下功能进行账户的处理====");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、密码修改");
            System.out.println("6、退出");
            System.out.println("7、注销当前账户");
            int cmd = sc.nextInt();
            switch (cmd) {
                case 1:
                    // 查询当前账户
                    showLoginAccount();
                    break;
                case 2:
                    // 存款
                    depositMoney();
                    break;
                case 3:
                    //取款
                    drawMoney();
                    break;
                case 4:
                    // 转账
                    transferMoney();
                    break;
                case 5:
                    // 密码修改
                    if(updatePassWord()){
                        return;
                    }
                    break;
                case 6:
                    // 退出：结束循环并回到欢迎页
                    System.out.println(loginAcc.getUserName()+"已退出系统!");
                    return;
                case 7:
                    // 注销当前账户
                    if (deleteAccount()){
                        // 销户成功 返回欢迎页
                        return;
                    }
                    break;
                default:
                    System.out.println("您当前的操作不正确，请确认~");
            }
        }
    }

    /**
     * 更改密码
     */
    private boolean updatePassWord() {
        while (true) {
            System.out.println("===更改密码===");
            System.out.println("请输入您的密码：");
            String password = sc.next();
            if(password.equals(loginAcc.getPassWord())){
                // 密码正确 进行修改
                while (true) {
                    System.out.println("输入您的新密码：");
                    String newPassword1 = sc.next();
                    System.out.println("再次输入您的新密码：");
                    String newPassword2 = sc.next();
                    // 两次密码是否相同
                    if(newPassword1.equals(newPassword2)){
                        // 相同则更新密码
                        loginAcc.setPassWord(newPassword1);
                        System.out.println("修改成功！！！");
                        return true;
                    }else{
                        System.out.println("两次密码不一致，请重新输入！！");
                    }
                }
            }else {
                System.out.println("密码不正确！！请重新输入~");
            }
        }
    }

    /**
     * 销户
     * @return
     */
    private boolean deleteAccount() {
        System.out.println("===进行销户操作===");
        // 1 询问用户确定销户
        System.out.println("请问您确定销户？y/n");
        String cmd = sc.next();
        switch (cmd){
            case "y":
                // 确定销户
                // 2 判断账户下是否有钱
                if(loginAcc.getMoney() == 0){
                    // 可以销户
                    accountArrayList.remove(loginAcc);
                    System.out.println("您好~您的账户已销户成功~~~");
                    return true;
                }else {
                    System.out.println("您的账户下存在余额，销户失败！！！");
                    return false;
                }
            default:
                System.out.println("好的，不销户~");
                return false;
        }
    }

    /**
     * 转账
     */
    private void transferMoney() {
        System.out.println("===开始转账===");
        // 1 判断系统中是否存在其他用户
        if (accountArrayList.size()<2){
            System.out.println("当前系统没有更多账户，无法转账！！");
            return;
        }
        // 2 判断自己账户是否有钱
        if(loginAcc.getMoney() == 0){
            System.out.println("您名下账户没钱~");
            return;
        }
        // 3 转账业务
        while (true) {
            System.out.println("请输入对方卡号");
            String cardId = sc.next();
            // 4 判断卡号是否正确
            Account acc = getAccountByCardId(cardId);
            if(acc == null){
                System.out.println("您输入的对方卡号不存在~~");
            }else{
                // 对方账户存在，继续认证对方姓氏
                String name = "*"+acc.getUserName().substring(1);
                System.out.println("请您输入【"+name+"】的姓氏: ");
                String preName = sc.next();
                // 5 判断姓氏是否正确
                if(acc.getUserName().startsWith(preName)){
                    while (true){
                        // 认证通过，可以转账
                        System.out.println("请您输入转账给对方的金额：");
                        double money = sc.nextDouble();
                        // 6 判断这个金额是否没超过自己的余额
                        if(loginAcc.getMoney()>=money){
                            // 转给对方并更新自己的余额
                            loginAcc.setMoney(loginAcc.getMoney()-money);
                            // 更新对方账户余额
                            acc.setMoney(acc.getMoney()+money);
                            System.out.println("叮咚~转账成功，成功转给"+acc.getUserName()
                                    +money+"元！，您当前余额是："+loginAcc.getMoney());
                            return;// 跳出循环
                        }
                    }
                }
            }
        }
    }

    /**
     * 取钱
     */
    private void drawMoney() {
        System.out.println("===取钱操作===");
        // 1 判断用户余额是否达到100，，不够100 不给取钱呢
        if (loginAcc.getMoney() < 100){
            System.out.println("您的账户余额不足100元，不允许取钱~~");
            return;
        }
        // 2 用户可以取钱
        while (true){
            System.out.println("请您输入取款金额：");
            double money = sc.nextDouble();
            // 3 判断余额是否足够
            if(loginAcc.getMoney()>=money){
                // 余额足够
                // 4 判断当前取款是否超额度
                if(money > loginAcc.getLimit()){
                    System.out.println("您当前取款金额超过额度，您每次最多可取："+loginAcc.getLimit());
                }else{
                    // 可以进行取钱
                    loginAcc.setMoney(loginAcc.getMoney()-money);
                    System.out.println("您取款："+money+"成功取款后剩余："+loginAcc.getMoney());
                    break;// 跳出循环并退出取钱操作
                }
            }else {// 余额不足
                System.out.println("余额不足，您的余额是："+loginAcc.getMoney());
            }
        }
    }

    /**
     * 存钱
     */
    private void depositMoney() {
        System.out.println("==存钱操作==");
        System.out.print("请你输入存款金额：");
        double money = sc.nextDouble();
        // 更新当前账户余额
        loginAcc.setMoney(loginAcc.getMoney()+money);
        System.out.println("恭喜您存钱"+money+"成功，存钱后余额是："+loginAcc.getMoney());
    }

    /**
     * 显示当前登录用户信息
     */
    private void showLoginAccount() {
        System.out.println("=====当前账户信息如下~=====");
        System.out.println("用户名:" + loginAcc.getUserName());
        System.out.println("用户性别:" + loginAcc.getSex());
        System.out.println("用户卡号:" + loginAcc.getCardId());
        System.out.println("用户余额:" + loginAcc.getMoney());
        System.out.println("用户限额:" + loginAcc.getLimit());
    }

    /**
     * 完成用户开户操作
     */
    private void createAccount() {
        // 1 创建一个账户对象，用于封装用户信息
        Account acc = new Account();
        // 2 需要用户自己输入自己的开户信息，赋值给账户对象
        // 2.1 账户名称
        System.out.println("请您输入您的账户名称： ");
        String name = sc.next();
        acc.setUserName(name);
        // 2.2 账户性别
        while (true) {
            System.out.println("请您输入您的性别： ");
            char sex = sc.next().charAt(0);
            if (sex == '男' || sex == '女') {
                acc.setSex(sex);
                break;
            } else {
                System.out.println("您输入的性别有误~只能是男或女~");
            }
        }
        // 2.3 账户密码
        System.out.println("请您输入您的密码： ");
        while (true) {
            System.out.println("请您输入您的密码：");
            String passWord = sc.next();
            System.out.println("请您输入您的确认密码：");
            String okPassWord = sc.next();
            // 判断2次密码是否一样
            if (okPassWord.equals(passWord)) {
                acc.setPassWord(okPassWord);
                break;
            } else {
                System.out.println("两次密码不一致，请您再次确认~~");
            }
        }
        // 2.4 账户取现额度
        System.out.println("请您输入您的取现额度：");
        double limit = sc.nextDouble();
        acc.setLimit(limit);
        // 3 将账户对象加入集合中
        String cardId = createCardId();
        acc.setCardId(cardId);
        System.out.println("恭喜您~" + acc.getUserName() + "开户成功！！！" + "您的卡号是：" + cardId);
        accountArrayList.add(acc);
    }

    /**
     * 返回一个8位数字的卡号，而且这个卡号不能与其他账户的卡号重复
     */
    private String createCardId() {
        // 1 定义一个String类型的变量记住8位数字作为一个卡号
        while (true) {
            String cardId = "";
            // 2 返回一个8位的cardId
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                int data = r.nextInt(10);
                cardId += data;
            }
            // 3 判断卡号是否与其他账户的卡号冲突了
            Account acc = getAccountByCardId(cardId);
            if (acc == null) {
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询账户对象
     */
    private Account getAccountByCardId(String cardId) {
        for (int i = 0; i < accountArrayList.size(); i++) {
            Account acc = accountArrayList.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }
}
