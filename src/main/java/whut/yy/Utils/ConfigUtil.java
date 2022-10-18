package whut.yy.Utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil {
    /**
     * 获取配置文件中的配置项值
     *
     * @param key
     * @return
     */
    public static String getConfigProperty(String key) {
        String propertyValue = "";
        try {
            InputStream in = ConfigUtil.class.getClassLoader()
                    .getResource("config.properties").openStream();//不用加上resources
            Properties prop = new Properties();
            prop.load(in);
            propertyValue = prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return propertyValue;
    }

}
