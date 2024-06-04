package DSA_Java_Revisions;

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position");
        String empID = sc.next();
        System.out.println("Enter the level");
        int level =sc.nextInt();

        switch (empID) {
            case "Director":
                System.out.println("AdamSleeve");
                break;
            case "Technician":
                System.out.println("Rahul");
                break;
            case "Worker":
                switch (level) {
                    case 1:
                        System.out.println("Principal Worker");
                        break;

                    case 2:
                        System.out.println("Senior worker");
                        break;
                    default:
                        System.out.println("Junior Worker");

                }
                break;
            default:
                System.out.println("Robot does the cleaning..lol...");
                break;
        }
    }
}
