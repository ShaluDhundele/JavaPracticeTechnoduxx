package Session11;

import java.util.Scanner;

public class Lab_015_PrintHighestNumber {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = user.nextInt();

        System.out.println("Enter Second Number:");
        int num2 = user.nextInt();

        System.out.println("Enter Third Number:");
        int num3 = user.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("Highest Number:"+ num1);
        }
        else if (num2>num1 && num2>num3){
            System.out.println("Highest Number:"+ num2);
        }
        else {
            System.out.println("Highest Number:" + num3);
        }
    }
}
