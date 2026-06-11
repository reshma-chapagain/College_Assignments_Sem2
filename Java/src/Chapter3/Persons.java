package Chapter3;

class Persons {
    String name = "John";
    int age = 19;
    String city = "Kathmandu";

    public void show() {
        System.out.println("Chapter3.Student inheritance properties:");
    }
}

// Child Class
class student extends Persons {
    String course = "Java";
    int marks = 78;
}