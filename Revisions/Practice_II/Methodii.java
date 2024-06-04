package Practice_II;

import java.util.Scanner;
public class Methodii {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String message = data(sc.nextLine());
        System.out.println(message);
    }
    static String data(String id){
        String name = "Hello " + id;
        return name;
    }
}
