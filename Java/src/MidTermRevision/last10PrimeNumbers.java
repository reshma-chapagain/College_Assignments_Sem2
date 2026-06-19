package MidTermRevision;

class Last10PrimeNumbers {

    public static void main(String[] args) {

        int min = 0;
        int max = 1000;
        int count = 0;

        for (int i = max; i >= min && count < 10; i--) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
    }

    // Check prime numbers
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}