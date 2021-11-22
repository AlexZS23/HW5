import java.util.Scanner;

public class OddEven {

//    Write method which returns True or False if
//    a given number is even or odd

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        int someNumber = s.nextInt();

        System.out.println("Is my number even? " + "Answer: " + evenOdd(someNumber));

    }

    public static Boolean evenOdd(int someNumber){

        if (someNumber%2 == 0){
            return true;
        } else {
            return false;
        }

    }
}
