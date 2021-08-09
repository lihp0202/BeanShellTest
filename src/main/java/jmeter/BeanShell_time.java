package jmeter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BeanShell_time {
    public static void main(String[] args) {
        //10位的秒级时间戳
        long time = 1627377168;
        String result = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(time*1000));
        System.out.println(result);
        //13位毫秒级时间戳
        double time1= 1627377137000d;
        String result1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time1);
        System.out.println(result1);
        

    }
}
