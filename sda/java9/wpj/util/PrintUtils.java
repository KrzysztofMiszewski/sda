package sda.java9.wpj.util;

public class PrintUtils {
    
    public static void out(String msg) {
        System.out.println(msg);
    }
    
    public static void out(String msg, String content) {
        System.out.println(msg + ": " + content);
    }
    
    public static void err(String msg) {
        System.err.println(msg);
    }
}