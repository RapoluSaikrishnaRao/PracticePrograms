package com.example.saikrishna.sampleex;

import java.util.Scanner;

public class PrimeNumbers
{
    public static void main(String args[])
    {
        //findPrimeNumber(3);
        printVowels("saikrishnA");
        Scanner scanner = new Scanner(System.in);
        int i=0,num=0;
        String PrimeNumber = "";
        System.out.println("Enter the value of n:");
        int  n = scanner.nextInt();
        for(i=1;i<=n;i++)
        {
            int  counter=0;
            for(num=i;num>=1;num--)
            {
                if(i%num==0)
                {

                    counter = counter+1;
                }
            }
            if(counter==2)
            {
                PrimeNumber=PrimeNumber+i+" ";
            }
        }
        System.out.println("Prime Numbers from 1 to n "+PrimeNumber);
    }

    private static void findPrimeNumber(int n)
    {
        int i=0,num=0,flag=0;
        num = n/2;

        if(n==0 || n==1)
        {
            System.out.println("it is not Prime Number");
        }
        else
        {
            for(i=2;i<=num;i++)
            {
              if(n%1==0)
              {
                  System.out.println(n+" is not prime number");
                  flag = 1;
                  break;
              }
            }
            if(flag==0)
            {
                System.out.println(n+" is  Prime Number");
            }
        }

    }

    private static void printVowels(String string){
        if (!string.equals("")){
            for (int i=0 ; i< string.length();i++){
                char value = string.toLowerCase().charAt(i);
                if (value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u'){
                    System.out.println(value+" is  vowel");
                }
            }
        }
    }
}
