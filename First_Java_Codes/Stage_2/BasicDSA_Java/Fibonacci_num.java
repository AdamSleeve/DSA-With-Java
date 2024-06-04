package BasicDSA_Java;

//an example of fibinacci numbers are 0, 1, 1, 2, 3, 5 etc
public class Fibonacci_num {
    public static void main(String[] args) {
        int num=9, firstNum= 0, secondNum =1;
        int nextNum;
        for(int i=1; i<=num; i++){
            System.out.print(firstNum + ", ");



            nextNum= firstNum+ secondNum;
            firstNum=secondNum;
            secondNum= nextNum;
        }
    }
}
