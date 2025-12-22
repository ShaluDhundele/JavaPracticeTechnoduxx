package Session8;

import java.util.Scanner;

// User Input concept with Calculator program

    public class Lab009_Calculator {
        public static void main(String[] args) {
            Scanner user = new Scanner(System.in);
            System.out.println("Enter the first number:");
            System.out.println("Enter the second number:");
            double a = user.nextDouble();
            double b = user.nextDouble();
            System.out.println(a+b);
            System.out.println(a-b);
            System.out.println(a*b);
            System.out.println(a%b);
        }
    }
