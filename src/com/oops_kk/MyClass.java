package com.oops_kk;

class MyClass {
    static int count = 0;  // Step 2: Class loading pe initialize
    int instanceVar = 10;  // Step 3: Object creation pe initialize

    static {
        System.out.println("Class loaded!");  // Step 1: Class loading
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }
}