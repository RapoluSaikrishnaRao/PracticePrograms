package com.example.saikrishna.sampleex;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String args[]) {
        int[] marks = new int[6];
        float total = 0, avg;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {

            if (i == 1) {
                System.out.println("Please Enter English Marks");
            } else if (i == 2) {
                System.out.println("Please Enter Hindi Marks");
            } else if (i == 3) {
                System.out.println("Please Enter Math's Marks");
            } else if (i == 4) {
                System.out.println("Please Enter Science Marks");
            } else if (i == 5) {
                System.out.println("Please Enter Social Marks");
            } else {
                System.out.println("Please Enter Telugu Marks");
            }
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        avg = total / 6;
        System.out.println("The student Grade is: " + avg);
        if (avg >= 80) {
            System.out.print("A Grade");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("B Grade");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("C Grade");
        } else {
            System.out.print("D Grade");
        }
    }
}
