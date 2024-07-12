package Singletone;

import java.util.HashMap;
import java.util.Map;

class ConfigurationManager {
    private static ConfigurationManager instance;
    private Map<String, String> settings;
    private ConfigurationManager() {
        settings = new HashMap<String, String>();
        loadSettings();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                    return instance;
                }
            }
        }
        return instance;
    }

    private void loadSettings() {
        settings.put("appName", "MyApp");
        settings.put("version", "1.0.2");
        settings.put("maxConnections", "100");
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

}

public class Singletone {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();


        String appName = configManager.getSetting("appName");
        String version = configManager.getSetting("version");
        String maxConnections = configManager.getSetting("maxConnections");

        System.out.println("Application Name: " + appName);
        System.out.println("Version: " + version);
        System.out.println("Max Connections: " + maxConnections);

        configManager.setSetting("Year of dev", "2012");



        System.out.println("Application Name: " + appName);
        System.out.println("Version: " + version);
        System.out.println("Max Connections: " + maxConnections);
        System.out.println("Year of dev: " + configManager2.getSetting("Year of dev") );
    }
}
