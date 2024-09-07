package day1;

import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a, b, c, d, m and n : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        float x1 = (m * d - b * n) / (a * d - b * c);
        float x2 = (n * a - m * c) / (a * d - b * c);
        if((a * d - b * c) == 0)
            System.out.println("Solution is not possible as denominator is 0.");
        else
            System.out.println("X1 = " + x1 + "     X2 = " +x2);
    }
}
