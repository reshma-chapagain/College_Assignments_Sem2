package Chapter2;/*
Write a java program whether given number ins Chapter2.palindrome number or not.
Eg:1221
1321
 */

public class palindrome {
    public static void main(String[] args) {
        int num = 1221;
        int original = num;
        int reversed = 0;

        while(num > 0) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num/10;
        }

        if(original == reversed) {
            System.out.println("Palindrome");
        }

        else {
            System.out.println("Not Chapter2.palindrome");
        }
    }


}
