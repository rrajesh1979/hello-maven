package org.rrajesh1979.demo;

public class HelloMaven {
    static String MESSAGE = "Hello World!!!!";

    public static String getMessage() {
        System.out.println("Inside getMessage()");
        // System.out.println(StringUtils.capitalize(MESSAGE));
        return MESSAGE;
    }

    public static void main(String[] args) {
        System.out.println(getMessage() + " from main method of HelloMaven!!!!");
    }
}
