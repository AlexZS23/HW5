public class UpdMinimumInArray {

//    3. Write a program that finds the minimum value in an array

    public static void main(String[] args) {

        int[] arr = {10, 20, -15, -52, 4, -20};
        System.out.println(minValue(arr));
    }

    public static Integer minValue(int[] someArray){

        int minimum = someArray[0];
        int dl = someArray.length;

        for (int i = 1; i < dl; i++) {
            if (someArray[i] < minimum) {
                minimum = someArray[i];
            }
        }
        return minimum;
    }
}
