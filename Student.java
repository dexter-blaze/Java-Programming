package day3;

import java.util.Scanner;

public class Student {
    // int max1 = 0, r = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int size = sc.nextInt();

        int[] roll = new int[size];
        int[][] marks = new int[size][4];
        int sum;
        int k = 0, max1 = 0, r = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the roll number of student " + (i + 1) + " : ");
            roll[i] = sc.nextInt();
            System.out.println("Enter the marks of student " + (i + 1));

            sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Subect " + (j + 1) + " : ");
                int mark = sc.nextInt();
                if (mark >= 0 && mark <= 100) {
                    marks[i][j] = mark;
                    sum += marks[i][j];
                } else {
                    System.out.println("Again enter the marks for subject" + (j + 1));
                    j--;
                }
            }
            marks[i][3] = sum;
            if (marks[i][3] > max1) {
                max1 = marks[i][3];
                r = roll[i];
            }
            System.out.println("Total marks of student " + (i + 1) + " is " + sum);
        }

        System.out.println("The highest total marks = " + max1 + " and the roll number = " + r);
        for (int i = 0; i < 3; i++) {
            int max = 0;
            k = 0;
            for (int j = 0; j < size; j++) {
                if (marks[j][i] > max) {
                    max = marks[j][i];
                    k = roll[j];
                }
            }
            System.out.println(
                    "The highest marks in subject " + (i + 1) + " = " + max + " and the roll number = " + k + ".");
        }
    }
}
