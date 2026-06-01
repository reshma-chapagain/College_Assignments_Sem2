public class Encapsulation {

    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("Abcde");
        p1.setAge(20);
        System.out.println("Name:" + p1.getName());
        System.out.println("Age" + p1.getAge());
    }
}

 class Person {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;

    }


    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
