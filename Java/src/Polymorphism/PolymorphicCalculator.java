package Polymorphism;

public class PolymorphicCalculator {
    int add (int a, int b) {
        System.out.println("Adding two integers");
        return a + b;

    }
        float add (float a, float b){
            System.out.println("Adding two floats");
            return a+b;
        }
    public static void main(String[] args) {
        PolymorphicCalculator calc = new PolymorphicCalculator();
        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10.2, 20.3));
    }
}
