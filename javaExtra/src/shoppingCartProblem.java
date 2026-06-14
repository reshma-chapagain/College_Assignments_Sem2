import java.util.Scanner;
public class shoppingCartProblem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;


        System.out.print("WHat item would you like to buy?:");
        item = scanner.next();

        System.out.print("How many do you want?:");
        quantity = scanner.nextInt();

        System.out.print("How much for each?:");
        price = scanner.nextDouble();

        total = price * quantity;

        System.out.println("/n You have bought" + quantity+ "" + item + "/s");
        System.out.println("Your total is " + currency + total);
    }
}
