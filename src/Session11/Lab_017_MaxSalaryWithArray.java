package Session11;

public class Lab_017_MaxSalaryWithArray {
    public static void main(String[] args) {
        double[] marks = {80, 12, 5, 78, 34, 56, 90};
        double mark = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > mark) {
                mark = marks[i];
            }
        }
            System.out.println("The Max Number is:" + mark);
        }
    }