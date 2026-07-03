package Unit4.Interface;

public class TestInterface2 {

interface Bank{
    float rateofInterest();
}
    static class SBI implements Bank {
        public float rateofInterest() {
            return 1.8f;
        }
    }

   static class PNB implements Bank {
        public float rateofInterest() {
            return 6.7f;
        }
    }
    public static void main(String[] args) {
    Bank b = new PNB();
        System.out.println("ROI\n" + b.rateofInterest() );

        Bank b2 = new SBI();
        System.out.println("ROI\n" + b2.rateofInterest() );
    }
}
