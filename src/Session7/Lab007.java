package Session7;

import java.util.Scanner;

// Leap year program
public class Lab007 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the year:");
        double year = user.nextInt();

        if (year%4 ==0 && year%100 !=0 && year %400 == 0)
        {
            System.out.println("The Number is Leap Year");
        }
        else
        {
            System.out.println("The Number is not a Leap Year");
        }
    }
}
