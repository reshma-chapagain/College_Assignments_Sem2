public class Student {
    int id;
    String name;

    Student()
        {
        id=0;
        }
    Student(int id, String name){
        id=id;
        name=name;
    }

    void display(){
        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student s1=new Student(1,"ABC");
        Student s2=new Student(2,"DEF");

        s1.display();
        s2.display();
    }
}
