package Chapter2;

import java.util.Scanner;
public class ArraywithSum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int number[] = new int[n];

        int sum = 0;
        int average = 0;
        for(int i = 0; i < n; i++) {
            int count = i;
            System.out.println("Enter the " + ++count);
            number[i] = scanner.nextInt();
            sum += number[i];
            average = sum / count;
        }

        scanner.close();
        System.out.println("The sum is " + sum);
        System.out.println("Average" + average);
    }
}

//odd if else  after for loop:
/*
try {
number [i] = Integer.parseInt (scanner.next()):
if(number [i] % 2 = 0) {
evenSum = evenSum + number [i];
}

else {
oddSum = oddSum + number [i];
}

catch ( InoytMismatchException ){
System.out.println("Invalid input");

}
}
 */
