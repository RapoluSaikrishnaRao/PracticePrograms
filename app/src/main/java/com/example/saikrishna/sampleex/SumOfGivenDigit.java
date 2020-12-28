package com.example.saikrishna.sampleex;

public class SumOfGivenDigit
{



    public static void main(String args[])
    {

        //findSumOfGivenNumber(222);
        System.out.print(""+findSumOfGivenNumber(226));
    }

    private static int findSumOfGivenNumber(int number) {

        int sum = 0;

        while (number != 0)
        {
            sum = sum + number % 10;
            number = number/10;
        }
        return sum;
    }
}
