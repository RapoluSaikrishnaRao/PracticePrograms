package com.example.saikrishna.sampleex;

import java.util.HashMap;
import java.util.Scanner;

public class AlphabetSearch {
    public static void main(String args[]) {
        HashMap<Character, Integer> integerHashMap = new HashMap<>();


        Scanner reader = new Scanner(System.in); // Reading from System.in
        System.out.println("Enter a Alphabet: ");
        String n = reader.next(); // Scans the next token of the input as an int.
        //String input = "abc".toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < n.length(); i++) {
            System.out.print(alphabet.indexOf(n.charAt(i)) + 1);
        }
    }
}
