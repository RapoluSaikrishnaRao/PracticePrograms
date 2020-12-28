package com.example.saikrishna.sampleex;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringsExample
{
    public static void main(String args[])
    {
        String str="STRESS";
        for(int i=0;i<str.length();i++)
        {

            System.out.println("String   "+str.indexOf(str.charAt(i)));
        }



        int n1=0,n2=1,n3=1,n4,count=10;
        for(int s=0;s<count;s++)
        {
            n4=n1+n2+n3;
            System.out.println("Series===>"+n4);
            n1=n2;
            n2=n3;
            n3=n2;
            n1++;
        }


        HashMap<String,String> hashMap = new HashMap();
        hashMap.put("Sai","Saikrishna");
        hashMap.put("Ram","SaiRam");
        hashMap.put("Ram1","SaiRam1");

        System.out.println("HashMap==="+hashMap);

        System.out.println("=========================");
        System.out.println("Set With KeySet");
        System.out.println("=========================");
        Set set=hashMap.keySet();
        System.out.println("KeySets are   "+set);

        System.out.println("=========================");
        System.out.println("Set With Values");
        System.out.println("=========================");
        Collection collections = hashMap.values();
        System.out.println("Collection Values are  "+collections);

        System.out.println("=========================");
        System.out.println("Set With EntrySet");
        System.out.println("=========================");
        Set values=hashMap.entrySet();
        System.out.println("EntrySets are  "+values);

        Iterator iterable = values.iterator();
        while (iterable.hasNext())
        {
            Map.Entry entry = (Map.Entry) iterable.next();
            System.out.println("=========================");
            System.out.println("Set With Map.Entry");
            System.out.println("=========================");

            System.out.println("Key   "+entry.getKey()+"::::"+entry.getValue());
            if(entry.getKey().equals("Ram1"))
            {
                entry.setValue("Krishna");
            }

        }
        System.out.println("Update   "+hashMap);


    }
}
