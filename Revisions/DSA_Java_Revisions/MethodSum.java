package DSA_Java_Revisions;

public class MethodSum {
    public static void main(String[] args) {
//      int ans=  method();
      int ans = methodii(20, 30);
        System.out.println(ans);
    }
//    static int method(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the first number: ");
//        int firstNum = in.nextInt();
//
//        System.out.print("Enter the second number: ");
//        int secondNum = in.nextInt();
//        int sum = firstNum + secondNum;
//        return sum;
//    }

    static int methodii(int a, int b){
        int sum = a + b;
        return sum;

    }
}
