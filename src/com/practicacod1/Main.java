package com.practicacod1;

public class Main {
    int status = 1;

    public static void main(String[] args) {
        Main prueba = new Main();
        A a = new A(prueba);
        B b = new B(prueba);
        C c = new C(prueba);
        a.start();
        b.start();
        c.start();
    }
}
