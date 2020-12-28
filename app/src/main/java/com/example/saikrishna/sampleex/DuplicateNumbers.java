package com.example.saikrishna.sampleex;

import java.util.ArrayList;

public class DuplicateNumbers
{
    public static void main(String args[])
    {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(28);
        integers.add(26);
        integers.add(23);
        integers.add(1);
        integers.add(4);
        integers.add(6);
        integers.add(50);
        integers.add(10);
        integers.add(10);
        integers.add(20);
        integers.add(20);
       /* for(int i=1;i<30;i++)
        {
            integers.add(i);
        }
        integers.add(20);*/

        for(int i=0;i<integers.size();i++)
        {
            for(int j=i+1;j<integers.size();j++)
            {
                if(integers.get(i).equals(integers.get(j)))
                {
                    System.out.println("Duplicate Number isFor===>"+integers.get(i));
                }
            }
        }
        //System.out.println("Duplicate Number is===>"+findDuplicateNumber(integers));
    }

    private static int findDuplicateNumber(ArrayList<Integer> integers)
    {
        int MaxNumber=integers.size()-1;
        int total=getSum(integers);
        System.out.println("Duplicate Number issss===>"+total);
        return total-(MaxNumber*(MaxNumber+1)/2);
    }

    private static int getSum(ArrayList<Integer> integers)
    {
        int sum=0;
        for(int i=0;i<integers.size();i++)
        {

            sum+=integers.get(i);
        }

        return sum;
    }
}
