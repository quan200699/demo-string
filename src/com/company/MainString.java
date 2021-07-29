package com.company;

public class MainString {

    public static void main(String[] args) {
        String x = "abc";
        String y = new String("abc");
        final String a = "a";
        final String b = "bc";
        String z = "a" + "bc";

        System.out.println(x == z);
        String className = "    C0521G1     ";
        System.out.println(className.trim());
    }
}
