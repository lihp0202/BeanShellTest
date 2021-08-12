package jmeter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timetest {
    public static void main(String[] args) throws ParseException {
        double time  = 1628060340776d;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String newtime = sdf.format(time);
        System.out.println(newtime);

        String time2 = "2021-08-06 02:59:00";
        Date time3 = sdf.parse(time2);
        System.out.println(time3);

    }
}
