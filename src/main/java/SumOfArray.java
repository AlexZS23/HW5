public class SumOfArray {

//    Write a method which returns the sum of a
//    given array

    public static void main(String[] args) {
        int[] check = {15, 20, 8};
        System.out.println(sumOfArray(check));


    }

    public static Integer sumOfArray(int[] someArray){
        int sumOfArray = 0;

        for (int i = 0; i < someArray.length; i++){
            sumOfArray = sumOfArray + someArray[i];
        }
        return sumOfArray;



    }

}
