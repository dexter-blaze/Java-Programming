package day2;

import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of side a, b & c : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c && b + c > a && a + c > b) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            if ((a == b) && (b == c)) {
                System.out.println("Triangle abc is an equilateral triangle.");
                System.out.println("Area of the triangle : " + area);
            } else if ((a != b) && (b != c) && (c != a)) {
                if (((a * a) + (b * b) == (c * c)) || ((b * b) + (c * c) == (a * a)) || ((a * a) + (c * c) == (b * b))) {
                    System.out.println("Triangle abc is a right angled scalene triangle.");
                    System.out.println("Area of the triangle : " + area);
                } else {
                    System.out.println("Triangle abc is a non right angled scalene triangle.");
                    System.out.println("Area of the triangle : " + area);
                }
            } else {
                System.out.println("Triangle abc is an isosceles triangle.");
                System.out.println("Area of the triangle : " + area);
            }
        } else
            System.out.println("abc is not a triangle.");
    }
}
