package jmeter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BeanShell_Date {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*String time = sdf.format(date);
        System.out.println(time);
        Date datenew = sdf.parse(time);
        System.out.println(datenew);
*/
        Calendar cal = Calendar.getInstance();//获取日历实例
        cal.setTime(date);//设置初始时间
        cal.add(Calendar.DAY_OF_YEAR,+1);//日期加1天
        String orderDate = sdf.format(cal.getTime());//格式化成String格式
        System.out.println(orderDate);
        cal.add(Calendar.DAY_OF_YEAR,+365);//日期加365天
        String orderDate1 = sdf.format(cal.getTime());//格式化成String格式
        System.out.println(orderDate1);

    }
}
