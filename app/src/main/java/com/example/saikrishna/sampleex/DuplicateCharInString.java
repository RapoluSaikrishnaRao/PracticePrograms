package com.example.saikrishna.sampleex;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharInString {
    public static void main(String args[]) {
        //findDuplicateChar("Appminds");
        //System.out.println("Duplicate_Char===>" + findDuplicateChar("Appminds"));
        //
        //String string1 = "sai";
        int count=0;
        System.out.println("Enter a String ");
        Scanner scanner = new Scanner(System.in);
        String string1=scanner.next();
        //Converts given string into character array
        char[] string = string1.toCharArray();
        //Counts each character present in the string
        for(int i = 0; i <string.length; i++) {
            count = 1;
            for(int j = i+1; j <string.length; j++) {
                if(string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if(count > 1 && string[i] != '0') {
                //System.out.println("Duplicate character in given string  ");
                System.out.print(" "+string[i]);
                //System.out.println(string[i]);
            }
        }
    }

    private static String findDuplicateChar(String str)
    {
        HashMap<Character, Integer> dupChar = new HashMap<>();
        char[] chars = str.toCharArray();

        for (Character character : chars) {
            if (dupChar.containsKey(character)) {

                dupChar.put(character, dupChar.get(character) + 1);
            } else {
                dupChar.put(character, 1);
            }
        }


        Set<Character> characters = dupChar.keySet();
        for (Character character : characters) {
            if (dupChar.get(character) > 1) {
                System.out.println(character + "   " + dupChar.get(character));
            }
        }
        return str;
    }

}
