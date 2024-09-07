package day2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = sc.nextDouble();
        double area = (22 * r * r) / 7;
        double circumference = (2 * 22 * r) / 7;
        System.out.println("Area of the circle : " + area );
        System.out.println("Circumference of the circle : " + circumference);
    }
}
