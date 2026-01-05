package Session9;

import java.util.Scanner;

public class Lab011_SwitchCases {
    public static void main(String[] args) {

        System.out.println("Mention the browser");
        String browser;
        Scanner br = new Scanner(System.in);
        browser = br.nextLine();
        switch (browser)
        {
            case "Chrome":
                System.out.println("Chrome initiated");
                break;
            case "Edge":
                System.out.println("Edge initiated");
                break;
            case "Firefox":
                System.out.println("Firefox initiated");
                break;
            default:
                System.out.println("Invalid Browser");
        }
    }
}
