import java.util.Scanner;

public class UpdCheckOddEven {

//    2.Написать программу с названием “CheckOddEven”, которая печатает “Odd Number” если переменная “number”
//    типа int нечетная.
//    Или “Even Number” если переменная четная.
//    Программа всегда должна перед выходом печатать “BYE”

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = in.nextInt();

        System.out.println(checkOddEven(num));
        System.out.println("BYE");

    }

    public static String checkOddEven(int someNumber){

        String result;

            if (someNumber%2 == 0){
                result = "Even Number";
            }else {
                result = "Odd Number";
            }

            return result;
        }


}
