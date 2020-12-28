package com.example.saikrishna.sampleex;

public class EvenOddThread
{
    public static void main(String args[])
    {
        OddEvenThread OddThread =new OddEvenThread(1);
        OddEvenThread evenThread1 =new OddEvenThread(0);

        Thread oddthread=new Thread(OddThread,"Odd");
        Thread eventhread2=new Thread(evenThread1,"Even");
        oddthread.start();
        eventhread2.start();

    }


}
class OddEvenThread implements Runnable{
    private int MaxNumber=10;
    static  int  number=1;
    private int remainder;
    static  Object lock = new Object();
    public OddEvenThread(int remainder) {
        this.remainder=remainder;
    }

    @Override
    public void run()
    {
      while (number<MaxNumber)
      {
          synchronized (lock)
          {
              while (number % 2 != remainder)
              {
                  try {
                      lock.wait();

                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
              System.out.println(number+" "+Thread.currentThread().getName());
                 number++;
                 lock.notifyAll();

          }

      }


    }
}
