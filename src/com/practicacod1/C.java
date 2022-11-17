package com.practicacod1;

public class C extends Thread{
    Main prueba;


    public C(Main prueba){
        this.prueba = prueba;
    }

    public void run() {
        try {
            synchronized (prueba) {
                for (int i = 0; i < 10; i++) {
                    while (prueba.status != 1) {
                        prueba.wait();
                    }
                    System.out.print("\nHilo C: " + i);
                    sleep(500);
                    prueba.status = 2;
                    prueba.notifyAll();
                }
            }
        } catch (Exception e) {
            System.out.println("Exception 1 :" + e.getMessage());
        }
    }
}
