package DesignPattern;

public class Configuration {
    private static Configuration instance;
    private String configValue;

    private Configuration() {
        // Đọc file cấu hình
        configValue = "Some configuration value";
    }

    public static synchronized Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getConfigValue() {
        return configValue;
    }
}
