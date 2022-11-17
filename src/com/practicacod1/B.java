package com.practicacod1;

public class B extends Thread {
    Main prueba;


    public B(Main prueba){
        this.prueba = prueba;
    }

    public void run() {
        try {
            synchronized (prueba) {
                for (int i = 0; i < 10; i++) {
                    while (prueba.status != 2) {
                        prueba.wait();
                    }
                    System.out.print("\nHilo B: " + i);
                    sleep(500);
                    prueba.status = 3;
                    prueba.notifyAll();
                }
            }
        } catch (Exception e) {
            System.out.println("Exception 1 :" + e.getMessage());
        }
    }
}
