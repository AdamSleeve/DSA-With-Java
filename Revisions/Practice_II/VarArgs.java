package Practice_II;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, "Sleeve");
    }
    static void fun(int a, int b, String ...v){
        System.out.println(a+b +" " + Arrays.toString(v));
    }
}
