import java.util.Scanner;

public class UpdCompareMagnitude {

//    6.Написать программу которая будет сравнивать величину (magnitude) двух чисел.
//    Например, если одно число = 3, а второе число = -9, программа должна выдать,
//    что число -9 имеет большую величину.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();

        System.out.println(checkMagnitude(a, b));
    }

    public static String checkMagnitude(int a, int b){

        String check;
        if (Math.abs(a) > Math.abs(b)){
            check = "Число " + a + " имеет большую величину";
        }else if (Math.abs(a) < Math.abs(b)){
            check = "Число " + b + " имеет большую величину";
        }else {
            check = "Величина чисел " + a + " и " + b + " одинаковая.";
        }
        return check;

    }
}
