package Session12;

public class Lab_021_Inheritance_ChildClass extends Lab_021_Inheritance_ParentClass {
    public static void main (String[] args){
        Lab_021_Inheritance_ParentClass C = new Lab_021_Inheritance_ParentClass();
        C.size(28,5);
        System.out.println(C.size(28,5));
        C.size("inch","foot");
        System.out.println(C.size("2 Inch"," 2 Foot"));
        C.size(89.8,34.8);
        System.out.println(C.size(89.8,34.8));
    }
}
