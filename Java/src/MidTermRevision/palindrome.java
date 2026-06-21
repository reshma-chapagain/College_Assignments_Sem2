package MidTermRevision;

public class palindrome {
    public static void main(String[] args) {
        int n = 121;
        int original = n;
        int rev = 0;
        while (n > 0) {


            int last = n % 10;


            rev = rev * 10 + last;

            n = n / 10;
        }
            if (original == rev) {
                System.out.println("ITS palindrome");
            } else {
                System.out.println("NOT ITS palindrome");
            }
        }
    }

