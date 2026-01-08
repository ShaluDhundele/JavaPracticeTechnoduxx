package Session12;

public class Lab_020_Methods {
    //Non-parameterized Method
    void message () {
        System.out.println("Hello World");
    }
    //Parameterized Method
    void add(int a,int b){
        int result = a + b;
        System.out.println(result);
    }
    //Return Type Method
    int sub (int a, int b){
        return a - b;
    }
    public static void main(String[] args){
        Lab_020_Methods Method = new Lab_020_Methods();
        Method.add(45,90);
        Method.sub(115,89);
        System.out.println(Method.sub(115,89));
        Method.message();
    }
}
