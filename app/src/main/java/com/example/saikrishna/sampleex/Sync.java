package com.example.saikrishna.sampleex;

public class Sync {
    public static void main(String[] args)
    {
        FirstThread first =new FirstThread();
        FirstThread1 firstThread = new FirstThread1(first);
        FirstThread1 firstThread2 = new FirstThread1(first);
        firstThread.start();
        firstThread2.start();

    }
}
class FirstThread
{



    public  void Print(int n)
    {

        synchronized(this){
            for (int i = 0; i <= n; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class FirstThread1 extends Thread implements Runnable
{
    FirstThread firstThread;
    public FirstThread1(FirstThread first) {
        this.firstThread=first;
    }

    @Override
    public void run()
    {
        firstThread.Print(5);
    }
}

