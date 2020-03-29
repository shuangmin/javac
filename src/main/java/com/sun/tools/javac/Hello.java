package com.sun.tools.javac;

public class Hello {
    private int a = 1;
    private int b = 1;

    public int add() {
        return a + b;
    }

    public int sum(int c) {
        int d = a + b + c;
        return d;
    }
}
