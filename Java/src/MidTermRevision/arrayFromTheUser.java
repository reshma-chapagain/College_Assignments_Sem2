package MidTermRevision;

import java.util.Scanner;

public class arrayFromTheUser {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: input size of array
            System.out.print("Enter number of elements (N): ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            // Step 2: input array elements
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int evenSum = 0;
            int oddSum = 0;

            // Step 3: calculate sums
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    evenSum += arr[i];
                } else {
                    oddSum += arr[i];
                }
            }

            // Step 4: display results
            System.out.println("Sum of Even Numbers = " + evenSum);
            System.out.println("Sum of Odd Numbers = " + oddSum);

            sc.close();
        }
    }

