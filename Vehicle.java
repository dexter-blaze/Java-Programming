package day6;

import java.util.*;

class Vehicle
{
    protected String regnNumber;
    protected double speed;
    protected String color;
    protected String ownerName;


    public Vehicle(String regnNumber, double speed, String color, String ownerName)
    {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }
    public void showData()
    {
        System.out.println("This is a vehicle class.");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner: " + ownerName);
    }
}

class Bus extends Vehicle
{
    private String routeNumber;
    public Bus(String regnNumber, double speed, String color, String ownerName, String routeNumber)
    {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override public void showData()
    {
        super.showData();
        System.out.println("Bus Details: Route Number - " + routeNumber);
    }
}

class Car extends Vehicle
{

    private String manufacturerName;

    public Car(String regnNumber, double speed, String color, String ownerName, String manufacturerName)
    {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }


    @Override public void showData()
    {
        super.showData();
        System.out.println("Car Details: Manufacturer - " + manufacturerName);
    }
}


class RunVehicle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vehicle details:");
        System.out.print("Registration Number: ");
        String regnNumber = scanner.nextLine();

        System.out.print("Speed (km/h): ");
        double speed = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Color: ");
        String color = scanner.nextLine();

        System.out.print("Owner's Name: ");
        String ownerName = scanner.nextLine();

        System.out.println("Choose vehicle type (1 - Bus, 2 - Car): ");
        int choice = scanner.nextInt();

        if (choice == 1)
        {

            scanner.nextLine(); // Consume the newline character
            System.out.print("Bus Route Number: ");
            String routeNumber = scanner.nextLine();
            Bus bus = new Bus(regnNumber, speed, color, ownerName, routeNumber);
            bus.showData();
        }
        else if(choice == 2)
        {
            scanner.nextLine(); // Consume the newline character
            System.out.print("Car Manufacturer: ");
            String manufacturerName = scanner.nextLine();
            Car car = new Car(regnNumber, speed, color, ownerName, manufacturerName);
            car.showData();
        }
        else
        {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
}


