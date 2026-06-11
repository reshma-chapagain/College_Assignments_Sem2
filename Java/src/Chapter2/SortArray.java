package Chapter2;
//wap to get max min avg and sum of a given fixed cell
import java.util.Arrays;

public class SortArray {
    public static void main(String args[]) {
        int array[] = {120,1,20,30,50};
        Arrays.sort(array);
        System.out.println("Sorted array:");
        for(int i =0; i<array.length; i++) {
            System.out.println(array[i]);
/*
int sum = 0;
for(int i = 0; i< array.length; i++) {
sum +=
 */

        }
        int min = array[0];
        int max = array[array.length - 1];

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        int sum = 0;
        for(int i = 0; i< array.length; i++) {
            sum += array[i];
        }
        int avg = sum / array.length;

        System.out.println("Sum is :" + sum);
        System.out.println("Average is:" + avg);
    }
}

