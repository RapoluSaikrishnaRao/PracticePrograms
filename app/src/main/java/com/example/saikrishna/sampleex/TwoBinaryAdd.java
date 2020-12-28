package com.example.saikrishna.sampleex;

import java.util.Scanner;

public class TwoBinaryAdd {
    public static void main(String args[])
    {
        int i=0,carry=0;
        int[] sum= new int[10];
        long b1,b2;
        System.out.println("Please Enter First Binary digit");
        Scanner scanner1= new Scanner(System.in);
        b1=scanner1.nextLong();
        System.out.println("Please enter Second Binary Digit");
        Scanner scanner2= new Scanner(System.in);
        b2=scanner2.nextLong();

        while (b1 !=0 || b2 !=0)
        {
            sum[i++]=(int)((b1%10+b2%10+carry)%2);
            carry=(int)((b1%10+b2%10+carry)/2);
            b1=b1/10;
            b2=b2/10;
        }
        if(carry != 0)
        {
            sum[i++]=carry;
        }
        --i;
        System.out.println("Output is ");
        while (i>=0)
        {
            System.out.print(sum[i--]);
        }
        System.out.println("\n");
    }
}
