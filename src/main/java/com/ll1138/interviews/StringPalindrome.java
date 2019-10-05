package com.ll1138.interviews;

public class StringPalindrome {

    private static boolean iterative (String arg) {

        int lo = 0, hi = arg.length()-1;

        while(hi > lo) {
            if(arg.charAt(lo) != arg.charAt(hi)) return false;
            lo += 1;
            hi -= 1;
        }

        return true;
    }

    private static boolean recursive(String arg) {

        if (arg.length() < 2) return true; //this means we have 1 or 0 characters to check

        if(arg.charAt(0) != arg.charAt(arg.length() - 1)) return false;

        return recursive(arg.substring(1, arg.length() - 1));

    }

    public static boolean check(String arg) {

        arg = arg.toLowerCase().replaceAll("\\s","");

        return iterative(arg) && recursive(arg);
    }
}
