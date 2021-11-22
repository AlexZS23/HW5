import java.util.Scanner;

public class UpdCheckPassFail {

//    1.Написать программу с названием “CheckPassFail”, которая выводит PASS если переменная “mark”
//    типа int больше или
//    равно 50 или вывести “FAIL” в противном случае.
//    Программа всегда должна перед выходом печатать “DONE”

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int mark = in.nextInt();

        System.out.println(checkPassFail(mark));

        System.out.println("DONE");

    }

    public static String checkPassFail(int value){

        String result;

        if (value >= 50) {
            result = "PASS";
        }else {
            result = "FAIL";
        }

        return result;

    }
}
