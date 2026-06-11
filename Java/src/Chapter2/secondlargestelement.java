package Chapter2;

public class secondlargestelement {
    public static void main(String[] args) {
        int[] arr = {1 ,23 ,3 ,12 ,16};
        int largest = arr[0];
        int secondlargest = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }

        for(int i = 0; i <arr.length; i++) {
            if(arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        System.out.println("Second Largest: " + secondlargest);
    }
}
