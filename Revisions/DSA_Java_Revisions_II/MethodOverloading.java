package DSA_Java_Revisions_II;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(Fmethod(10, 80));
        System.out.println("the float value is " + Smethod(10.2, 20.1));
    }
    static int Fmethod(int x, int y){
        return x + y;
    }
    static double Smethod(double x, double y){
        return x + y;
    }
}
