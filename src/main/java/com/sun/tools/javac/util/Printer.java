package com.sun.tools.javac.util;

public class Printer {
    public static final <T> void p(String tag, Iterable<T> params) {
        System.out.print(tag);
        System.out.print(" ");
        p(params);
    }

    public static final <T> void p(String tag, List<T> params) {
        System.out.print(tag);
        System.out.print(" ");
        p(params.toArray());
    }

    public static final <T> void p(String tag, T[] params) {
        System.out.print(tag);
        System.out.print(" ");
        p(params);
    }

    public static final <T> void p(T[] params) {
        if(params == null) return;
        for (T param : params) {
            System.out.print(param);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static final <T> void p(Iterable<T> params) {
        if(params == null) return;
        for (T param : params) {
            System.out.print(param);
            System.out.print(" ");
        }
        System.out.println();
    }
}
