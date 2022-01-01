package org.rrajesh1979.demo;

import org.apache.commons.lang3.StringUtils;

public class HelloMaven {
    static String MESSAGE = "Hello World!!!!";

    public static String getMessage() {
        System.out.println("MESSAGE: " + MESSAGE);
        System.out.println(StringUtils.capitalize(MESSAGE));
        return MESSAGE;
    }

    public static void main(String[] args) {
        System.out.println(MESSAGE + " from main method of HelloMaven!!!!");
    }
}
