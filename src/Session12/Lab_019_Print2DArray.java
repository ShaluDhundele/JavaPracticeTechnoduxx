package Session12;

import java.sql.SQLOutput;

public class Lab_019_Print2DArray {
    public static void main(String[] args) {
        int arr[][] = {{23, 43, 90},
                {67, 37, 26},
                {89, 76, 34}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
