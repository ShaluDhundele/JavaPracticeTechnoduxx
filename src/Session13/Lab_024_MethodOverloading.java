package Session13;

public class Lab_024_MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }
    int mul(int a, int b, int c) {
        return a * b * c;
    }
    double sub(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Lab_024_MethodOverloading calc = new Lab_024_MethodOverloading();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.mul(10, 20, 30));
        System.out.println(calc.sub(5.5, 4.5));
    }
}
