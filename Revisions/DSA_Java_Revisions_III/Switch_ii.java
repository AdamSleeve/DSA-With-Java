import java.util.Scanner;

public class Switch_ii {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("input the correct number");
        }
    }
}