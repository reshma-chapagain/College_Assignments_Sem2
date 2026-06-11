package Chapter2;

public class Array {
    public static void main(String[] args)

    {
        double array[];
        array = new double[10];
        int intArray [] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < array.length; i++) {
            array[i] = intArray[i];
            System.out.println("double array" + array [i]);
        }

    }
}
