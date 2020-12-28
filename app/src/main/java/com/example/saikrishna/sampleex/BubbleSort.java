package com.example.saikrishna.sampleex;

public class BubbleSort
{
    public static void main(String args[])
    {
        int[] bubbleSort={22,6,33,0,1,2,3,55,66};
        findBubbleSort(bubbleSort);
    }

    private static void findBubbleSort(int[] bubbleSort) {

        int n=bubbleSort.length;
        int k;
        for(int m=n;m>0;m--)
        {
            for(int i=0;i<n-1;i++)
            {
                k=i+1;
                if(bubbleSort[i]>bubbleSort[k])
                {
                    swapArray(i,k,bubbleSort);
                }
            }
            printArray(bubbleSort);
        }
    }

    private static void printArray(int[] bubbleSort) {
        for(int i=0;i<bubbleSort.length;i++)
        {
            System.out.print(bubbleSort[i]);
        }
        System.out.println("\n");
    }

    private static void swapArray(int i, int k, int[] bubbleSort) {
        int temp=bubbleSort[i];
        bubbleSort[i]=bubbleSort[k];
        bubbleSort[k]=temp;
    }
}
