package OOP;

public class MultipleObjects_ii {
    String fname = "Adam";
    String lname = "Temidayo";
    int age = 24;

    public static void main(String[] args) {
        MultipleObjects_ii obj = new MultipleObjects_ii();
        System.out.println("Name: " + obj.fname + " " + obj.lname);
        System.out.println("Age: " + obj.age );
    }
}
