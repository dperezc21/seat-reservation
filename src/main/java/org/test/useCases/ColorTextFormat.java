package org.test.useCases;

public class ColorTextFormat {
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static String redColor(String text) {
        return ANSI_RED + text + ANSI_RESET;
    }
}
