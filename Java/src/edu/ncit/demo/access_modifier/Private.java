package edu.ncit.demo.access_modifier;

class Data {
    private String name;

    // Getter method
    public String getName() {
        return this.name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    private void display(String displayAttributes) { // black box
        System.out.println("name:: " + displayAttributes);
    }

    public void displayName(Data data) {
        display(data.getName());
    }

    private Data() {
        System.out.println("private constructor");
    }

    public Data(String name) {
        this.name = name;
    }
}

public class Private {
    public static void main(String[] args) {
        Data data = new Data("test Data");  // uses public constructor

        // Access/modify private variable via setter
        data.setName("Programiz");

        // Access private variable via getter
        System.out.println(data.getName());

        // Call public method that internally calls private display()
        data.displayName(data);

        // data.name;          // ❌ compile-time error – private field
        // data.display(...);  // ❌ compile-time error – private method
        // new Data();         // ❌ compile-time error – private constructor
    }
}