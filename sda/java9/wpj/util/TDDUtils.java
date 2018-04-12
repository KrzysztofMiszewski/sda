package sda.java9.wpj.util;

public class TDDUtils {
    
	public static void test(String msg, boolean val, boolean expected) {
        System.out.println("[TEST][CASE] \"" + msg + "\"");
        System.out.println("[TEST][GOT] " + val);
        System.out.println("[TEST][EXPECTED] " + expected);
        if (val != expected) {
            System.err.println("[ERROR] Wartość oczekiwana różna od otrzymanej!");
            throw new IllegalArgumentException("Wartość oczekiwana różna od otrzymanej (" 
                                                + val + " != " + expected + ")");
        }
    }    

	public static void test(String msg, byte val, byte expected) {
        System.out.println("[TEST][CASE] \"" + msg + "\"");
        System.out.println("[TEST][GOT] " + val);
        System.out.println("[TEST][EXPECTED] " + expected);
        if (val != expected) {
            System.err.println("[ERROR] Wartość oczekiwana różna od otrzymanej!");
            throw new IllegalArgumentException("Wartość oczekiwana różna od otrzymanej (" 
                                                + val + " != " + expected + ")");
        }
    }
	
	public static void test(String msg, short val, short expected) {
        System.out.println("[TEST][CASE] \"" + msg + "\"");
        System.out.println("[TEST][GOT] " + val);
        System.out.println("[TEST][EXPECTED] " + expected);
        if (val != expected) {
            System.err.println("[ERROR] Wartość oczekiwana różna od otrzymanej!");
            throw new IllegalArgumentException("Wartość oczekiwana różna od otrzymanej (" 
                                                + val + " != " + expected + ")");
        }
    }
	
	public static void test(String msg, char val, char expected) {
        System.out.println("[TEST][CASE] \"" + msg + "\"");
        System.out.println("[TEST][GOT] " + val);
        System.out.println("[TEST][EXPECTED] " + expected);
        if (val != expected) {
            System.err.println("[ERROR] Wartość oczekiwana różna od otrzymanej!");
            throw new IllegalArgumentException("Wartość oczekiwana różna od otrzymanej (" 
                                                + val + " != " + expected + ")");
        }
    }
	
	public static void test(String msg, int val, int expected) {
        System.out.println("[TEST][CASE] \"" + msg + "\"");
        System.out.println("[TEST][GOT] " + val);
        System.out.println("[TEST][EXPECTED] " + expected);
        if (val != expected) {
            System.err.println("[ERROR] Wartość oczekiwana różna od otrzymanej!");
            throw new IllegalArgumentException("Wartość oczekiwana różna od otrzymanej (" 
                                                + val + " != " + expected + ")");
        }
    }
	
	public static void test(String msg, long val, long expected) {
        System.out.println("[TEST][CASE] \"" + msg + "\"");
        System.out.println("[TEST][GOT] " + val);
        System.out.println("[TEST][EXPECTED] " + expected);
        if (val != expected) {
            System.err.println("[ERROR] Wartość oczekiwana różna od otrzymanej!");
            throw new IllegalArgumentException("Wartość oczekiwana różna od otrzymanej (" 
                                                + val + " != " + expected + ")");
        }
    }
	
	public static void test(String msg, float val, float expected) {
        System.out.println("[TEST][CASE] \"" + msg + "\"");
        System.out.println("[TEST][GOT] " + val);
        System.out.println("[TEST][EXPECTED] " + expected);
        if (val != expected) {
            System.err.println("[ERROR] Wartość oczekiwana różna od otrzymanej!");
            throw new IllegalArgumentException("Wartość oczekiwana różna od otrzymanej (" 
                                                + val + " != " + expected + ")");
        }
    }
	
	public static void test(String msg, double val, double expected) {
        System.out.println("[TEST][CASE] \"" + msg + "\"");
        System.out.println("[TEST][GOT] " + val);
        System.out.println("[TEST][EXPECTED] " + expected);
        if (val != expected) {
            System.err.println("[ERROR] Wartość oczekiwana różna od otrzymanej!");
            throw new IllegalArgumentException("Wartość oczekiwana różna od otrzymanej (" 
                                                + val + " != " + expected + ")");
        }
    }
	
	public static void test(String msg, String val, String expected) {
        System.out.println("[TEST][CASE] \"" + msg + "\"");
        System.out.println("[TEST][GOT] " + val);
        System.out.println("[TEST][EXPECTED] " + expected);
        if (val != expected) {
            System.err.println("[ERROR] Wartość oczekiwana różna od otrzymanej!");
            throw new IllegalArgumentException("Wartość oczekiwana różna od otrzymanej (" 
                                                + val + " != " + expected + ")");
        }
    }

}