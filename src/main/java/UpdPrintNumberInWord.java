import java.util.Scanner;

public class UpdPrintNumberInWord {

//    3.Написать программу с названием “PrintNumberInWord”, которая напечатает “ONE”, “TWO”, ..., “NINE”, “OTHER” если
//    переменная “number” типа int будет 1, 2, 3, 4, ... 9, или любой другой. Решить задачу двумя способами:
//            1) с использованием if..else if
//            2) с использованием switch-case

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = in.nextInt();

        System.out.println(word(number));

    }

    public static String word(int num){

        String value;

//        1й способ

        if (num == 1){
            value = "ONE";
        } else if (num == 2){
            value = "TWO";
        } else if (num == 3){
            value = "THREE";
        } else if (num == 4){
            value = "FOUR";
        }else if (num == 5){
            value = "FIVE";
        }else if (num == 6){
           value = "SIX";
        }else if (num == 7){
            value = "SEVEN";
        }else if (num == 8){
            value = "EIGHT";
        }else if (num == 9){
           value = "NINE";
        }else {
            value = "OTHER";
        }

//        2й способ

//        switch (num){
//            case 1:
//                value = "ONE";
//                break;
//            case 2:
//                value = "TWO";
//                break;
//            case 3:
//                value = "THREE";
//                break;
//            case 4:
//                value = "FOUR";
//                break;
//            case 5:
//                value = "FIVE";
//                break;
//            case 6:
//                value = "SIX";
//                break;
//            case 7:
//                value = "SEVEN";
//                break;
//            case 8:
//                value = "EIGHT";
//                break;
//            case 9:
//                value = "NINE";
//                break;
//            default:
//                value = "OTHER";
//
//        }
        return value;
    }
}
