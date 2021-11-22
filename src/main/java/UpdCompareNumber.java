import java.util.Scanner;

public class UpdCompareNumber {

    //    4.Написать программу, которая сравнивает два числа типа int и определяет, какое из чисел большее, а какое меньшее.
//    Программа должна вывести что-то типа “The number x has the greatest value”.
//    Где “x” одно из чисел

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = in.nextInt();
        System.out.println("Please enter the second number");
        int b = in.nextInt();

        System.out.println(check(a, b));

    }

    public static String check(int first, int second){

        String check;

        if (first>second){
            check = "The number " + first + " has the greatest value";
        }else if (first<second){
            check = "The number " + second + " has the greatest value";
        }else {
            check = "The numbers " + first + " and " + second + " are equal";
        }

        return check;

    }
}
