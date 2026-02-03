package ConfReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    private static Properties prop = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/Configuration/config.properties");
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Property File not found");
        }

    }

    public static String getProp(String key) {

        return prop.getProperty(key);
    }
}
