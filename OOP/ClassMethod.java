package OOP;

//Create a Car object named myCar.
//Call the fullThrottle() and speed() methods on the myCar object, and run the program:
//static and public program

public class ClassMethod {
    public static void main(String[] args) {
        ClassMethod ans = new ClassMethod();
        ans.fullThrottle();
        speed(200);
    }

    public void fullThrottle(){
        System.out.println("The car is running at full speed");
    }
    static void speed(int speed){
        System.out.println("Speed max is " + speed);
    }


}
