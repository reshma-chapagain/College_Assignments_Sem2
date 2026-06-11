package Chapter2;

public class Break_Arrayid {
    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int n : numbers) {
            if (n == 30) {
                break;
            }
            System.out.println(n);
        }
        System.out.println("********************************");
        for (int n : numbers) {
            if (n == 30) {
                continue; }
                System.out.println(n);

            System.out.println("************");
            boolean t = true;
            System.out.println("Before the return");
            if (t)
                return;

            System.out.println("WOnt Execute");
        }
    }
}
