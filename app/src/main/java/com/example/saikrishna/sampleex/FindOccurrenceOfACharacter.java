package com.example.saikrishna.sampleex;

public class FindOccurrenceOfACharacter {
    public static void main(String args[])
    {
        String str="beginnersbook";
        // Vovels and Consonetns
        VowelsandConsonants(str);

        int[] counter = new int[256];

        for(int i=0;i<str.length();i++)
        {
            counter[str.charAt(i)]++;
        }
        char[] array =new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            array[i]=str.charAt(i);
            int flag=0;
            for(int j=0;j<=i;j++)
            {
                if(str.charAt(i)==array[j])
                {
                    flag++;
                }
            }
            if(flag==1)
            {
                System.out.println("String is "+str.charAt(i)+counter[str.charAt(i)]);
            }
        }
    }

    private static void VowelsandConsonants(String str) {

        str=str.toLowerCase();
        int vCount=0,cCount=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vCount++;
            }
            else if(ch>='a'&&ch<='z')
            {
                cCount++;
            }
        }
        System.out.println("Vowels Count==="+vCount);
        System.out.println("Consonants Count==="+cCount);
    }
}
