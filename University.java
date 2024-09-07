package day11;
import java.sql.SQLOutput;
import java.util.*;

class University {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        try {
            if(!str.equals("University")) {
                throw new NoMatchFoundException("Input string does not match 'University.");
            }
            else {
                System.out.println("Input string match 'University'");
            }
        }
        catch (NoMatchFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}
