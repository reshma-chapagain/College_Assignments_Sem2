package MidTermRevision;

import java.util.Scanner;

import java.util.Scanner;
public class FactwithoutRecu {

    public static void main(String args[]) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        n = scanner.nextInt();
        int factorial = 1;

        for(int i = 1; i <=n; i++) {
            factorial = factorial * i;

            System.out.println(factorial);
        }


    }
}
