package OOP;

public class MultipleObjects {
    int x = 20;

    public static void main(String[] args) {
        MultipleObjects obj1 = new MultipleObjects();
        MultipleObjects obj2 = new MultipleObjects();
        obj2.x = 40;

        System.out.println(obj1.x);
        System.out.println(obj2.x);

        //Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:

    }

}
