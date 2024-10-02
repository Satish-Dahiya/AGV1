package webApp.utils;

import webApp.constants.EnvironmentType;

import java.util.Properties;

public class ConfigurationLoader {
    private final Properties properties;
    private static ConfigurationLoader configLoader;

    private ConfigurationLoader(){
        String env = System.getProperty("env", String.valueOf(EnvironmentType.DEV));
                properties = ConfigUtility.propertyLoader("src/test/resources/config.properties");

    }

    public static ConfigurationLoader getInstance(){
        if(configLoader == null){
            configLoader = new ConfigurationLoader();
        }
        return configLoader;
    }

    public String getUrl(){
        String prop = properties.getProperty("url");
        if(prop != null) return prop;
        else throw new RuntimeException("property baseUrl is not specified in the stage_config.properties file");
    }
    public String getBrowser(){
        String prop = properties.getProperty("browser");
        if(prop != null) return prop;
        else throw new RuntimeException("property baseUrl is not specified in the stage_config.properties file");
    }
    public String getUserName(){
        String prop = properties.getProperty("userName");
        if(prop != null) return prop;
        else throw new RuntimeException("property username is not specified in the stage_config.properties file");
    }
    public String getPassword(){
        String prop = properties.getProperty("password");
        if(prop != null) return prop;
        else throw new RuntimeException("property password is not specified in the stage_config.properties file");
    }
    public String getTimeOut(){
        String prop = properties.getProperty("timeOut");
        if(prop != null) return prop;
        else throw new RuntimeException("property password is not specified in the stage_config.properties file");
    }
}
