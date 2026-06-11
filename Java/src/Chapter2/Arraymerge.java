package Chapter2;

public class Arraymerge {
    public static void main(String[] args) {

        int[] array1 = {4, 7, 2, 9};
        int[] array2 = {1, 8, 5};

        int[] merged = new int[array1.length + array2.length];

        for (int i = 0; i < merged.length; i++) {


            if (i < array1.length) {
                merged[i] = array1[i];
            }


            else {
                merged[i] = array2[i - array1.length];
            }
        }

        System.out.print("Merged Chapter2.Array: ");

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);
        }
    }
}