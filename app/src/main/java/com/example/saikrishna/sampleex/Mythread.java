package com.example.saikrishna.sampleex;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Mythread {
    public static void main(String[] arg) {

        OddEvenRunnable oddRunnable=new OddEvenRunnable(1);
        OddEvenRunnable evenRunnable=new OddEvenRunnable(0);

        Thread t1=new Thread(oddRunnable,"Odd");
        Thread t2=new Thread(evenRunnable,"Even");

        t1.start();
        t2.start();


       /* t2=new Thread(new Runnable() {
            @Override
            public void run() {
                *//*System.out.print(mycount++ + " even \n");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(mycount>10)
                    System.exit(0);
                run();*//*

                do {
                    mycount = getCount();
                    if (mycount %2 == 0){
                        System.out.print(mycount++ + " even \n");
                    }
                }while (mycount <= 10);

                //run();

            }
        });*/



       /* t=new Thread(new Runnable() {
            @Override
            public void run() {
                //System.out.print(mycount++ + " odd \n");
                do {
                    mycount = getCount();
                    if (!(mycount %2 == 0)){
                        System.out.print(mycount++ + " ODD \n");
                    }
                }while (mycount <= 10);
            }
        });


        t.start();
        t2.start();*/

       /* String string="whatever";
        StringBuffer stringBuffer =  new StringBuffer(string);
        stringBuffer.reverse().toString();*/


        //String reverse = new StringBuffer(string).reverse().toString();
        //System.out.println("Revers===>"+stringBuffer.toString());



        /*int n=4133314;
        String str = String.valueOf(n);
        StringBuffer stringBuffer1 = new StringBuffer(str);
        str = stringBuffer1.reverse().toString();
        if(str.equals(String.valueOf(n)))
        {
            System.out.println("Polindrome===>");
        }
        else
        {
            System.out.println("Not Polindrome===>");
        }*/


      /* System.out.println("Not Polindrome===>"+Integer.toBinaryString(3));
        int a=550,b=160,c=100;

        if(a>b && a>c)
        {
            System.out.println("Polindrome===>A is Bigger");
        }
        else if(b>c && b>a)
        {
            System.out.println("Polindrome===>B is Bigger");
        }
        else if(c>a && c>b) {
            System.out.println("Polindrome===>c is Bigger");
        }
    }
*/
    /*public static int getCount(){
        return mycount++;
    }*/
    }

    private static class OddEvenRunnable implements Runnable{

        public int PRINT_NUMBERS_UPTO=10;
        static int  number=1;
        int remainder;
        static Object lock=new Object();

        OddEvenRunnable(int remainder)
        {
            this.remainder=remainder;
        }

        @Override
        public void run() {
            while (number < PRINT_NUMBERS_UPTO) {
                synchronized (lock) {
                    while (number % 2 != remainder) { // wait for numbers other than remainder
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " " + number);
                    number++;
                    lock.notifyAll();
                }
            }
        }
    }
}