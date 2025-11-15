package ex_30_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab250_Real_Example {
    public static void main(String[] args) {
        // Storing environment-specific configurations
        Map<String, String> envConfig = new HashMap<>();
        envConfig.put("production", "https://prod.api.com");
        envConfig.put("staging", "https://staging.api.com");

        //managing credentials
        Map<String,String> credentials = new HashMap<>();
        credentials.put("admin","admin123");
        credentials.put("user","user123");
        credentials.put("use1",null);
        credentials.put("user2",null);
    }
}
