package com.example.saikrishna.sampleex;

public class Sync {
    public static void main(String[] args) {
        PrintClass printClasss = new PrintClass();
        MyThreads myThreads =new MyThreads(printClasss);
        MyThreads myThreads1 =new MyThreads(printClasss);

        Thread thread =new Thread(myThreads);
        Thread thread1 =new Thread(myThreads1);

        thread.start();
        thread1.start();
    }
}

class PrintClass {
     public void printMethod(int number) {
         synchronized (this){
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
            try {
                Thread.sleep(300);
            } catch (Exception e) {

            }
        }
        }
    }
}

class MyThreads extends Thread {
    PrintClass printClass;

    MyThreads(PrintClass printClass) {
        this.printClass = printClass;
    }

    @Override
    public void run() {
        printClass.printMethod(10);
    }
}







