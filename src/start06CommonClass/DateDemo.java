package start06CommonClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime());
        System.out.println(date.toString());
        DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format1.format(date));
        try {
            Date date2 = format1.parse("1994-11-10 03:31:42");
            System.out.println(format1.format(date2));
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.toString());
//        "ERA", "YEAR", "MONTH", "WEEK_OF_YEAR", "WEEK_OF_MONTH", "DAY_OF_MONTH",
//                "DAY_OF_YEAR", "DAY_OF_WEEK", "DAY_OF_WEEK_IN_MONTH", "AM_PM", "HOUR",
//                "HOUR_OF_DAY", "MINUTE", "SECOND", "MILLISECOND", "ZONE_OFFSET",
//                "DST_OFFSET"
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.MINUTE));
    }
}
