package Unit4.MultipleInheritance;

public class first {
    int i = 10;
    void inherit(){
        System.out.println("Hello");
    }
}
class second extends first{
    void inherit(){
        System.out.println("World");
    }

    public static void main(String[] args) {
        second s = new second();
        s.inherit();
        System.out.println(s);
    }
}
