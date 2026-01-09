package Session13;

 class Encapsulation {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
 }

 public class Lab_022_Encapsulation {
    public static void main(String[] args) {

        Encapsulation s = new Encapsulation();
        s.setName("Shalu");
        System.out.println(s.getName());
    }
 }