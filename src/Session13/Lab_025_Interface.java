package Session13;

 interface A {
    void showA();
 }
 interface B {
    void showB();
 }
 class C implements A, B {
    public void showA() {
        System.out.println("This is interface A");
    }
    public void showB() {
        System.out.println("This is interface B");
    }
 }
  public class Lab_025_Interface {
      public static void main(String[] args) {
          C display = new C();
          display.showA();
          display.showB();
      }
  }
