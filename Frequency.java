package day1;

import java.util.*;

public class Frequency {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of R : ");
        double R = sc.nextDouble();
        System.out.print("Enter the value of L : ");
        double L = sc.nextDouble();
        double C = 0.01d;
        for( ; C <= 0.1; C += 0.01)
        {
            double F = Math.sqrt((1 / ( L * C)) - ((R * R) / (4 * C * C)));
            System.out.println("F = " + F);
        }
    }
}
