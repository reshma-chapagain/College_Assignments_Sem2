package Chapter3;

public class StudentStatic {

    int rollno;
    String name;
    static String college =" ITS";


    StudentStatic(int r, String n) {
        rollno = r;
        name = n;
    }


    void display () {
        System.out.println("Roll no:" + rollno + " Name:" + name + college);
    }

    public static void main (String[] args) {

        StudentStatic s1 = new StudentStatic(1,"RAM");
        StudentStatic s2 = new StudentStatic(2,"Abc");

        s1.display();
        s2.display();
    }
}
