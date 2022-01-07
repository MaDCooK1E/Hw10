package com.company;

public class Main {

    public static void main(String[] args) {
        CustomHouse customHouse = new CustomHouse();
        Thread thread = new Thread(customHouse);
        thread.start();

        for (int i = 0;  i<20 ; i++) {


            if (i ==13){
                thread.interrupt();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
