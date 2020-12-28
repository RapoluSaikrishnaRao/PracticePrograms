package com.example.saikrishna.sampleex;

public class MultiThreadConcept
{
    public static void main(String args[])
    {
        //Test test=new Test();

        MyThread myThread = new MyThread();
        Thread thread1=new Thread(myThread);
        thread1.start();


        MyThread2 myThread2 = new MyThread2();
        Thread thread=new Thread(myThread2);
        thread.start();
    }
}

class MyThread extends Thread
{
   /* Test test;
    public MyThread(Test test) {
        this.test=test;
    }*/

    public void run()
    {
       // System.out.println("This Is Thred Extended");
        Test.printShow(10);
    }


}
class MyThread2 extends Thread
{
/*Test test;
    public MyThread2(Test test) {
       this.test=test;
    }*/

    @Override
    public void run() {
       // System.out.println("This Is Thred Implemented");
        Test.printShow(100);
    }


}
class Test
{
    public static  void printShow(int n)
    {
        for(int i=1;i<5;i++)
        {
            System.out.println(n*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}