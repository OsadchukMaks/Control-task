package com.tasks;

public class ReplaceSymbols {
    public static String replace(String str) {
        return str
                .replaceAll("a","@")
                .replaceAll("o","0");
    }
}
