package com.example.saikrishna.sampleex;

import java.util.Scanner;

public class FindLeapYear {
    public static void main(String args[])
    {
        int year;
        boolean isLeap=false;
        System.out.println("Please Enter Any Year");
        Scanner scanner = new Scanner(System.in);
        year=scanner.nextInt();

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    isLeap= true;
                }
                else
                {
                    isLeap=false;
                }

            }
            else
            {
                isLeap=true;
            }

        }
        else
        {
            isLeap=false;
        }
        if(isLeap==true)
        {
            System.out.println(" "+year+" is Leap Year");
        }
        else
        {
            System.out.println(" "+year+" is not Leap Year");
        }
    }
}
