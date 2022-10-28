package whut.yy.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    public static String getCurTime(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(date);
    }
}
