package day6;

import java.util.*;

class Quadrilateral
{
    double x1;    double y1;    double x2;    double y2;    double x3;    double y3;    double x4;    double y4;
    Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        this.x1 = x1;        this.y1 = y1;        this.x2 = x2;        this.y2 = y2;        this.x3 = x3;
        this.y3 = y3;        this.x4 = x4;        this.y4 = y4;
    }
    double Area()
    {
        return -1;
    }
}

class Trapezoid extends Quadrilateral
{
    Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    @Override double Area()
    {
        double area = (0.5) * (Math.abs((x1*y2 + x2*y3 + x3*y4 + x4*y1) - (x2*y1 + x3*y2 + x4*y3 + x1*y4)));
        return area;
    }
}

class Parallelogram extends Quadrilateral
{
    Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);

    }
    @Override double Area()
    {
        double area = (0.5) * (Math.abs((x1*y2 + x2*y3 + x3*y4 + x4*y1) - (x2*y1 + x3*y2 + x4*y3 + x1*y4)));
        return area;
    }
}

class Rectangle extends Quadrilateral
{
    Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);

    }
    @Override double Area()
    {
        double area = (0.5) * (Math.abs((x1*y2 + x2*y3 + x3*y4 + x4*y1) - (x2*y1 + x3*y2 + x4*y3 + x1*y4)));
        return area;
    }
}

class Square extends Quadrilateral
{
    Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        super(x1, y1, x2, y2, x3, y3, x4, y4);

    }
    @Override double Area()
    {
        double area = (0.5) * (Math.abs((x1*y2 + x2*y3 + x3*y4 + x4*y1) - (x2*y1 + x3*y2 + x4*y3 + x1*y4)));
        return area;
    }

}

class Inherit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMenu");
        System.out.println("1. Parallelogram");
        System.out.println("2. Trapezoid");
        System.out.println("3. Rectangle");
        System.out.println("4. Square");
        System.out.print("Enter one of any quadrilateral : ");
        int n = sc.nextInt();

        System.out.println("Enter the value of x1, y1, x2, y2, x3, y3, x4, y4 : ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();

        if(n == 1)
        {
            Parallelogram p = new Parallelogram(x1, y1, x2, y2, x3, y3, x4, y4);
            System.out.println("Area of Parallelogram : " + p.Area());
        }
        else if(n == 2)
        {
            Trapezoid t = new Trapezoid(x1, y1, x2, y2, x3, y3, x4, y4);
            System.out.println("Area of Trapezoid : " + t.Area());
        }
        else if(n == 3)
        {
            Rectangle r = new Rectangle(x1, y1, x2, y2, x3, y3, x4, y4);
            System.out.println("Area of Rectangle : " + r.Area());
        }
        else
        {
            Square s = new Square(x1, y1, x2, y2, x3, y3, x4, y4);
            System.out.println("Area of Square : " + s.Area());
        }
    }
}


//import java.util.Scanner;
//
//class Quadrilateral {
//    double x1, y1, x2, y2, x3, y3, x4, y4;
//
//    Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
//        this.x1 = x1; this.y1 = y1; this.x2 = x2; this.y2 = y2;
//        this.x3 = x3; this.y3 = y3; this.x4 = x4; this.y4 = y4;
//    }
//
//    double area() {
//        return Math.abs((x1*y2 + x2*y3 + x3*y4 + x4*y1) - (x2*y1 + x3*y2 + x4*y3 + x1*y4)) / 2.0;
//    }
//}
//
//class Trapezoid extends Quadrilateral {
//    Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
//        super(x1, y1, x2, y2, x3, y3, x4, y4);
//    }
//}
//
//class Parallelogram extends Quadrilateral {
//    Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
//        super(x1, y1, x2, y2, x3, y3, x4, y4);
//    }
//}
//
//class Rectangle extends Quadrilateral {
//    Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
//        super(x1, y1, x2, y2, x3, y3, x4, y4);
//    }
//}
//
//class Square extends Quadrilateral {
//    Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
//        super(x1, y1, x2, y2, x3, y3, x4, y4);
//    }
//}
//
//class Inherit {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\nMenu");
//        System.out.println("1. Trapezoid");
//        System.out.println("2. Parallelogram");
//        System.out.println("3. Rectangle");
//        System.out.println("4. Square");
//        System.out.println("Enter one of any quadrilateral : ");
//        int n = sc.nextInt();
//
//        System.out.println("Enter the value of x1, y1, x2, y2, x3, y3, x4, y4 : ");
//        double x1 = sc.nextDouble();
//        double y1 = sc.nextDouble();
//        double x2 = sc.nextDouble();
//        double y2 = sc.nextDouble();
//        double x3 = sc.nextDouble();
//        double y3 = sc.nextDouble();
//        double x4 = sc.nextDouble();
//        double y4 = sc.nextDouble();
//
//        Quadrilateral shape;
//
//        switch (n) {
//            case 1:
//                shape = new Trapezoid(x1, y1, x2, y2, x3, y3, x4, y4);
//                break;
//            case 2:
//                shape = new Parallelogram(x1, y1, x2, y2, x3, y3, x4, y4);
//                break;
//            case 3:
//                shape = new Rectangle(x1, y1, x2, y2, x3, y3, x4, y4);
//                break;
//            case 4:
//                shape = new Square(x1, y1, x2, y2, x3, y3, x4, y4);
//                break;
//            default:
//                System.out.println("Invalid choice");
//                return;
//        }
//
//        System.out.println("Area: " + shape.area());
//    }
//}
