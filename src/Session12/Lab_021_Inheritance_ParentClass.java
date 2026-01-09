package Session12;

//Inheritance and Method Overriding

import javax.swing.*;

public class Lab_021_Inheritance_ParentClass {
    void ironing(){
        System.out.println("Steam Iron");
    }
    int size(int waist, int shoulder){
        return waist + shoulder;
    }
    String size(String S, String M){
        return S + M;
    }
    double size(double a, double b){
        return a + b;
    }
    public static void main (String[] args){
        Lab_021_Inheritance_ParentClass P = new Lab_021_Inheritance_ParentClass();
        P.size(78, 90 );
        System.out.println(P.size(78,90));
        P.size(56.9, 78.8);
        System.out.println(P.size(56.9,78.8));
        P.size("inch", "foot");
        System.out.println(P.size("8 Inch"," 2 Foot"));
    }
}
