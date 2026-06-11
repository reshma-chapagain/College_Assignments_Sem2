import Chapter3.Person;

public class multilevelInheritence {
    public void show(){
        System.out.println("person class");

    }
}
class Studentt extends Person {
    public void show1(){
        System.out.println("I am a Chapter3.Student ");
    }
}

class EngineeringStudent extends Studentt{
    public void show2(){
        System.out.println("Engineering Chapter3.Student");
    }
}
public class MultilevelDemo{
    public static void main(String args[]){
        EngineeringStudent obj=new EngineeringStudent();
        obj.show1();
        obj.show2();
    }
}