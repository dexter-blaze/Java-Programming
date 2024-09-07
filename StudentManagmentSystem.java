package day7;

import java.util.*;

interface Department
{
    void deptName(String dp);
    void deptHead(String hd);
    void showInfo();
}

class Hostel
{
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    Hostel(String hostelName , String hostelLocation , int numberOfRooms)
    {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    void printHostel()
    {
        System.out.println("Hostel name: " + hostelName);
        System.out.println("Hostel location: " + hostelLocation);
        System.out.println("Number of rooms: " + numberOfRooms);
    }
}



class Student extends Hostel implements Department
{
    String studentName;
    String regdNo;
    String electiveSubject;
    Double avgMarks;
    String deptName;
    String deptHead;

    Student(String hostelName , String hostelLocation , int numberOfRooms , String studentName , String deptName , String deptHead , String regdNo , String electiveSubject , Double avgMarks)
    {
        super(hostelName , hostelLocation , numberOfRooms);
        this.studentName = studentName;
        this.deptName = deptName;
        this.deptHead = deptHead;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    public void showInfo()
    {
        System.out.println("Student name : " + studentName);
        System.out.println("Department name : " + deptName);
        System.out.println("Department head : " + deptHead);
        System.out.println("Registration number : " + regdNo);
        System.out.println("Elective subject : " + electiveSubject);
        System.out.println("Average marks of the student : " + avgMarks);
    }

    public void deptName(String dp)
    {
        this.deptName = dp;
    }

    public void deptHead(String hd)
    {
        this.deptHead = hd;
    }

    public String getRegdNo()
    {
        return regdNo;
    }

}

class StudentManagmentSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student[] s1 = new Student[10];
        int i = 0;
        while(true)
        {
            System.out.println("\nMain Menu");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate the student");
            System.out.println("3. Display details of the student");
            System.out.print("Enter your choice : ");
            int n = sc.nextInt();
            if(n==1)
            {
                System.out.println("Enter student details ");
                System.out.print("Enter student name : ");
                String name = sc.next();
                System.out.print("Enter hostel name : ");
                String hostelName = sc.next();
                System.out.print("Enter hostel address : ");
                String hostelAddress = sc.next();
                System.out.print("Enter no. of rooms : ");
                int rooms = sc.nextInt();
                System.out.print("Enter department name : ");
                String deptName = sc.next();
                System.out.print("Enter department head : ");
                String deptHead = sc.next();
                System.out.print("Enter registration no. : ");
                String regno = sc.next();
                System.out.print("Enter elective paper : ");
                String elec = sc.next();
                System.out.print("Enter average marks : ");
                double avg = sc.nextDouble();
                s1[i] = new Student(hostelName , hostelAddress , rooms , name , deptName , deptHead , regno , elec , avg);
                i++;
            }
            else if(n==2)
            {
                System.out.print("Enter the registration number:  ");
                String reg = sc.next();
                int foundIndex = -1;
                for (int x = 0; x < i; x++)
                {
                    if (s1[x].getRegdNo().equals(reg)) {
                        foundIndex = x;
                        break;
                    }
                }
                if(foundIndex != -1)
                {
                    System.out.print("Enter the name of new department: ");
                    String newdp = sc.next();
                    System.out.print("Enter the name of new department head: ");
                    String newhd = sc.next();
                    s1[foundIndex].deptName(newdp);
                    s1[foundIndex].deptHead(newhd);
                    //s1[foundIndex].showInfo();
                    //s1[foundIndex].printHostel();
                    System.out.println("Student migrated successfully");
                }
                else
                {
                    System.out.println("Student with registration number " + reg + " not found");
                }

            }
            else
            {
                System.out.println("Enter the registration number:  " );
                String reg = sc.next();
                int foundIndex = -1;
                for (int x = 0; x < i; x++)
                {
                    if (s1[x].getRegdNo().equals(reg)) {
                        foundIndex = x;
                        break;
                    }
                }
                if (foundIndex != -1) {
                    s1[foundIndex].showInfo();
                    s1[foundIndex].printHostel();
                } else {
                    System.out.println("Student with registration number " + reg + " not found");
                }
            }
        }
    }
}