package MidTermRevision;
import java.util.Scanner;
public class FactorialwithRecursion {

    //Using Recursion
    static int fact(int n) {
        if(n == 0) {
            return 1;
        }

        return n * fact(n -1);
    }
    public static void main(String args[]) {
        int n;
        Scanner scanner = new Scanner(System.in);

       System.out.print("Enter a number: ");
       n = scanner.nextInt();

       System.out.println(fact(n));

        }

    }





