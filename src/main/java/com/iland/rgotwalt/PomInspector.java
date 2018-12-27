package com.iland.rgotwalt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PomInspector {

    private static final String APPLICATION_PROPERTIES_FILE_NAME = "src/main/resources/application.properties";

    private static final Properties applicationProperties;

    static {
        applicationProperties = new Properties();
        try {
            FileInputStream is = new FileInputStream(APPLICATION_PROPERTIES_FILE_NAME);
            applicationProperties.load(is);
        }
        catch (FileNotFoundException fileNotFoundException) { }
        catch (IOException ioException) { }
    }

    public static String getDisplayName() {
        return applicationProperties.getProperty("application.displayName");
    }

    public static String getAppVersion() {
        return applicationProperties.getProperty("application.version");
    }

}
