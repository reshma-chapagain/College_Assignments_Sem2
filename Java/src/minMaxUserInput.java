import java.util.Scanner;

public class minMaxUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number[] = new int [5];
        int sum =0 ;
        int average = 0;
        int min = 0;
        int max = 0;
    System.out.println("Enter number 1");
    int num = sc.nextInt();

    min = max = num;
    sum += num;
        for(int i = 2 ; i <5; i++) {
            System.out.print("Enter number" + i );
            num = sc.nextInt();

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

            sum += num;
        }

        double avg = (double) sum / 5;

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + avg);

        sc.close();
    }


}
