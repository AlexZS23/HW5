import java.util.Scanner;

public class UpdEquation {

//    5.Написать программу, которая бы решала уравнение вида a * x + b = 0
//    Переменные a и b можно задать вручную. Далее нужно будет посчитать и вывести значение “х”.
//    Программа должна также учитывать варианты, когда или а = 0 или b = 0

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter number 'a'");
        float a = in.nextFloat();
        System.out.println("Please enter number 'b'");
        float b = in.nextFloat();

        System.out.println(calculation(a, b));
    }

    public static String calculation(float a, float b){

        float x = b/-a;
        String text;

        if (b==0){
            text = "x = 0";
        }else if (a==0){
            text = "При заданных значениях а и b уравнение не имеет решения";
        }else {
            text = "x = " + x;
        }
        return text;

    }
}
