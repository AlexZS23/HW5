import java.util.Arrays;

public class ArrayOfCodes {

//    Write a method which returns an array of
//    codes for given array of chars

    public static void main(String[] args) {
        char[] myArray= {'a', 'b', 'd', '%'};
        codesOfArray(myArray);

        }

        public static int[] codesOfArray(char[] someArray){


            int[] codesOfArray = new int[someArray.length];
            for (int i = 0; i < someArray.length; i++){
                codesOfArray[i] = someArray[i];
                System.out.println(codesOfArray[i]);

            }
            return codesOfArray;

    }


}
