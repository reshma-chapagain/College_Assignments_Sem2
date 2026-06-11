package Chapter2;

public class operators {
    public static void main(String[] args) {

        int a = 10, b = 3;

        // Arithmetic
        System.out.println(a + b);   // 13
        System.out.println(a - b);   // 7
        System.out.println(a * b);   // 30
        System.out.println(a / b);   // 3  (integer division)
        System.out.println(a % b);   // 1  (remainder)

        // Comparison
        System.out.println(a > b);   // true
        System.out.println(a == b);  // false

        // Logical
        System.out.println(a > 5 && b < 5);   // true
        System.out.println(a > 20 || b < 5);  // true
    }
}