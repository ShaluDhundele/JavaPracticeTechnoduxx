package Session8;

import java.util.Scanner;
// User Input concept with leap year program

public class Lab008 {
    public static void main (String[] args){
        Scanner user = new Scanner (System.in);
                System.out.println("Enter the year:");
                int year = user.nextInt();

            if (year%4==0 && year%100!=0 && year%400==0) {
                System.out.println(year+ "is the leap year");
            }
            else {
                System.out.println(year + "is not the leap year");
            }

            }
    }
