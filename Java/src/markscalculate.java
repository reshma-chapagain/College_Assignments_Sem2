public class markscalculate {
           int marks1;
           int  marks2;

           void insert(int m1, int m2) {
               marks1 = m1;
               marks2 = m2;
           }
           void calculate() {
    int total = marks1 + marks2;
    String gradee;

    if(total<45) {
        System.out.println("Fail");
           }

    else if (total>=45 && total < 60){
       System.out.println("Grade B");
    }
    else if (total >= 60 && total <70) {
      System.out.println("Grade B+");
    }

    else if (total >=70 && total <80) {
        System.out.println("Grade A");
    }
    else {
        System.out.println("Grade A+");
    }
       }
public static void main(String[] args) {
               markscalculate student = new markscalculate();
               student.insert(85,90);
               student.calculate();
}
}
