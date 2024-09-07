package day2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int Y = sc.nextInt();
        if((Y % 4) == 0 && (Y % 100) != 0 || (Y % 400) == 0)
            System.out.println(Y + " is a leap year.");
        else
            System.out.println(Y + " is not a leap year.");
    }
}
