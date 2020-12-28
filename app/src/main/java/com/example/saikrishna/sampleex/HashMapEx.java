package com.example.saikrishna.sampleex;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx
{
    public static void main(String args[])
    {

        HashMap<Integer,Book> map=new HashMap<Integer,Book>();
        map.put(1,new Book("Sai","600","2"));
        map.put(2,new Book("Java","630","1"));
        map.put(3,new Book("Oracle","650","3"));
        map.put(4,new Book("Android","660","2"));

        for(int i=0;i<map.size();i++)
        {
            System.out.println("Key==="+map.get(i));
        }
    }
}
 class Book
{
    String bookName,bookPrise,bookEdition;

    public Book(String bookName, String bookPrise, String bookEdition) {
        this.bookName = bookName;
        this.bookPrise = bookPrise;
        this.bookEdition = bookEdition;
    }
}
