public class DisplayPrimeNumberOneToHundred {
    public static boolean isPrime(int number) {
        if(number <= 1) {
            return false;
        }
        for(int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void generateprimeNumber(int number) {
        boolean isPrime = false;
        for (int i = 1; i <= number; i++) {
            isPrime = isPrime(i);
            if(isPrime) {
                System.out.println("prime " + i);
            }
        }
    }

    public static void main(String[] args) {
        generateprimeNumber(100);  // ✅ just this
    }
}