public class UpdSortMinToMax {

//    4. Write a program that sorts an array from minimum to maximum

    public static void main(String[] args) {

        int[] arr = {10, 20, -15, -52, 4, -20, 100, -80};
        sortMinToMax(arr);
    }

    public static void sortMinToMax(int[] someArray) {
        int x;
        int dl = someArray.length;

        for (int i = 1; i < dl; i++) {
            for (int j = i; j > 0; j--) {
                if (someArray[j] < someArray[j - 1]) {
                    x = someArray[j];
                    someArray[j] = someArray[j - 1];
                    someArray[j - 1] = x;
                }
            }
        }
        for (int i = 0; i < dl; i++) {
            System.out.println(someArray[i]);
        }
    }
}
