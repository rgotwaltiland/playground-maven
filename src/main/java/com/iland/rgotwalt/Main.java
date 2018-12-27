package com.iland.rgotwalt;

public class Main {

    public static void main(String[ ] args) {
        String appDisplayName = PomInspector.getDisplayName();
        String appVersion = PomInspector.getAppVersion();

        System.out.println(String.format("Application \"%s\" is currently on version: \"%s\"", appDisplayName, appVersion));
    }

}
