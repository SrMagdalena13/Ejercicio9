package com.practicacod1;

public class A extends Thread {
    Main prueba;


    public A(Main prueba) {
        this.prueba = prueba;
    }

    public void run() {
        try {
            synchronized (prueba) {
                for (int i = 0; i < 10; i++) {
                    while (prueba.status != 3) {
                        prueba.wait();
                    }
                    System.out.print("\nHilo A: " + i);
                    sleep(500);
                    prueba.status = 1;
                    prueba.notifyAll();
                }
            }
        } catch (Exception e) {
            System.out.println("Exception 1 :" + e.getMessage());
        }
    }
}
