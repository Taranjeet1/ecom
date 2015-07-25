package pagem;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Asus on 25/07/2015.
 */
public class Loadproperties {

    static Properties prop;
    static String propertiesFileLocation="src/test/java/Properties/";
    static String propertiesFileName="TestdataProperties.properties";
    static FileInputStream input;

    public static String getProperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream(propertiesFileLocation + propertiesFileName);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);

    }

}
