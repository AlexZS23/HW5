import java.util.Scanner;

public class UpdReversibleString {


//    5. Write a program that outputs a reversible string (use an array of characters - char string [])

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите предложение для преобразования");
        String revers = in.nextLine();
        reverseChar(revers);
    }

    public static char[] reverseChar(String someText) {

        char[] rev = new char[someText.length()];

        for (int i = 0; i < someText.length(); i++) {
            rev[i] = someText.charAt(i);
        }

        int len = rev.length;

//        принт в правильном порядке
//
//        for (int i = 0; i < len; i++) {
//            System.out.println(rev[i]);
//        }
//        return rev;

//        Принт в обратном порядке

        while (len > 0) {
            System.out.println(rev[len - 1]);
            len--;
        }
        return rev;
    }
}
