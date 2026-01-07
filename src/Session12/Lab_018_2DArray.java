package Session12;

public class Lab_018_2DArray {
    public static void main(String[] args) {
        int arr[][] = {{23, 43, 90},
                       {67, 37, 26},
                       {89, 76, 34}};
        double mark = arr[0][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > mark) {
                    mark = arr[i][j];
                }
            }
        }
        System.out.println("The Max Number is:" + mark);
    }
}