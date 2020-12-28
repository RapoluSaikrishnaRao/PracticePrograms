package com.example.saikrishna.sampleex;

import android.widget.Toast;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class MySample
{
    public static void main(String[] args)
    {
        /***
         * India Map
         */
       // indiaMap();

        /****
         * String Alpha Count
         */
        String str="aaabbcca";


        for (int i = 0; i < str.length(); i++)
        {
            int freq = 1;
            while((i+1)<str.length()&&str.charAt(i) == str.charAt(i+1))
            {
                ++freq;
                ++i;
            }
            System.out.println("\n");
            System.out.print(""+str.charAt(i)+freq);
           // System.out.print("\n");
        }


        String string="12121";
        StringBuilder stringBuilder = new StringBuilder(string);
        StringBuilder stringBuilde = stringBuilder.reverse();
        if(string.equals(stringBuilde.toString()))
        {
            System.out.println("Polindrom");
        }
        else
        {
            System.out.println("not Polindrom");
        }


        /***
         * Binary
         */
       convertBinary(10);
        /***
         * Fibonacci Series
         */
        int n1=0,n2=1,n3,count=10;

        for (int i=0;i<count;i++)
        {
            n3=n1+n2;
            System.out.println("\n");
            System.out.print("   "+n3);
            n1=n2;
            n2=n3;
        }

        /***
         * Pyramid
         */
       int no=5;
       for(int i=0;i<=no;i++)
       {
           for(int j=no;j>=i;j--){
               System.out.print(" ");
           }
           for (int k=1;k<=i;k++)
           {
               System.out.print(" "+k);
           }
           System.out.println();
       }


        /***
         * Factorial
         */
       int index=5;
       int factorial = index;
       for(int i=index-1;i>1;i--)
       {
           factorial=factorial*i;
       }
        System.out.println(factorial);
       if(String.valueOf(factorial).endsWith("0"))
       {
           System.out.println("Yes");
       }
       else
       {
           //System.out.println(factorial);
           System.out.println("No");
       }



        /***
         * Swaping
         */
        int a=10,b=20;
        System.out.println("Before Swapping");
        System.out.println("A is==>"+a);
        System.out.println("B is==>"+b);
        swap(a,b);


        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A===>"+a+"B====>"+b);

        /***
         * Find Third Largest Number
         */
        //int[] thirdLargeNo={1,23,6,55,6,66,9,10,12,13};
        int thirdLargeNo[]={1,2,3,4,5,6,6,7,7};
        findingThirdLargestNo(thirdLargeNo,thirdLargeNo.length);
    }

    private static void findingThirdLargestNo(int[] thirdLargeNo, int count) {
        int i=0;
        int temp = 0;

       /* int size=thirdLargeNo.length;
        Arrays.asList(thirdLargeNo);

        Arrays.sort(thirdLargeNo);
        System.out.println("Third Largest No===>"+thirdLargeNo[size-3]);*/


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(8);

        // Add the elements to set
        HashSet<Integer> sett = new HashSet<>(list);
        //Collections.sort(sett,Collections.reverseOrder());
        // Clear the list

        list.clear();

        // add the elements of set
        // with no duplicates to the list
        list.addAll(sett);
       // Collections.reverse(list);
       // System.out.println("Third Largest Nos===>"+list.get(1));


       for(i=0;i<list.size();i++)
       {
           for(int j=i+1;j<list.size();j++)
           {
              
               if(list.get(i)>list.get(j))
               {
                   int one = list.get(i);
                   int two = list.get(j);
                   temp=one;
                   one=two;
                   two=temp;
               }

           }

          
       }


        System.out.println("Third Largest No===>"+list.get(list.size()-2));
    }

    private static void indiaMap() {
        int a=10,b=0,c=10;
        String s1="TFy!QJu ROo TNn(ROo)SLq SLq ULo+UHs UJq TNn*RPn/QPbEWS_JSWQAIJO^NBELPeHBFHT}TnALVlBLOFAkHFOuFETpHCStHAUFAgcEAelclcn^r^r\tZvYxXyT|S~Pn SPm SOn TNn ULo0ULo#ULo-WHq!WFs XDt!";
        a=s1.charAt(b);
        while (a != 0)
        {
            if (b < 170)
            {
                a = s1.charAt(b);
                b++;
                while (a > 64)
                {
                    a--;
                    if (++c=='Z')
                    {
                        c/=9;
                        System.out.print((char)(c));
                    }
                    else
                        System.out.print((char)(33 ^ (b & 0x01)));
                }
            }
            else
                break;
        }
    }

    private static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after Swapping");
        System.out.println("A is==>"+a);
        System.out.println("B is==>"+b);
    }

    private static void convertBinary(int decimal)
    {
        int[] binary = new int[40];
        int index=0;
        while(decimal>0)
        {
            binary[index++]=decimal%2;
            decimal=decimal/2;
        }
        for (int i=index-1;i>=0;i--)
        {
            System.out.print(binary[i]);
        }
        System.out.println();
    }
}
