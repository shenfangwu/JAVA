package com.wfs.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 案例：秒杀活动
 * 小吴下单并付款时间为：2023年11月11日 0:01:18
 * 小明下单并付款时间为：2023年11月11日 0:10:51
 * 秒杀时间是：2023年11月11日 0:00:00 - 2023年11月11日 0:10:00
 * 问是否秒杀成功？
 */
public class Test1 {
    public static void main(String[] args) throws ParseException {
        String startTime = "2023年11月11日 00:00:00";
        String endTime = "2023年11月11日 00:10:00";
        String xw = "2023年11月11日 00:01:18";
        String xm = "2023年11月11日 00:10:51";
        // 1 创建SimpleDateFormate对象 将格式调整与string一致
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        // 2 sdf解析String为date
        Date dateStart = sdf.parse(startTime);
        Date dateEnd = sdf.parse(endTime);
        Date xwDate = sdf.parse(xw);
        Date xmDate = sdf.parse(xm);
        // 3 date转毫秒值--方便比较
        if(xwDate.getTime()<dateStart.getTime()||xwDate.getTime()>dateEnd.getTime()){
            System.out.println("小吴失败");
        }else{
            System.out.println("小吴成功");
        }
        if(xmDate.getTime()<dateStart.getTime()||xmDate.getTime()>dateEnd.getTime()){
            System.out.println("小明失败");
        }else{
            System.out.println("小明成功");
        }
    }
}
