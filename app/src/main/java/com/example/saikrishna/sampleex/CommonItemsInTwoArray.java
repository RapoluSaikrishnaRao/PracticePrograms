package com.example.saikrishna.sampleex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonItemsInTwoArray
{
    public static void main(String[] args) {
        String[] orig = { "b", "b", "b", "b" };
        String[] act = { "x", "b", "b", "y","c" };
        ArrayList<String> origList = new ArrayList(Arrays.asList(orig));
        ArrayList<String> actList =new ArrayList (Arrays.asList(act));
        origList.retainAll(actList);
        System.out.println(origList);
    }
}
