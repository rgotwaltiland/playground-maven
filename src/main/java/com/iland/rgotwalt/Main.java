package com.iland.rgotwalt;

public class Main {

    public static void main(String[ ] args) {
        String appVersion = PomInspector.getAppVersion();

        System.out.println(String.format("Currently on version: \"%s\"", appVersion));
    }

}
