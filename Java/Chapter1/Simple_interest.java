public class Simple_interest {

    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Simple_interest simpleInterest = new Simple_interest();

        double si = simpleInterest.calculateSimpleInterest(1000, 5, 2);
        System.out.println("Simple Interest: " + si);
    }
}
