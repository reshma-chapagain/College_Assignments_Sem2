package Chapter2;

class Rectanglee {
    int length;
    int breadth;


void insert (int l, int b) {
    length = l;
    breadth = b;

}
    void calculateArea () {
        System.out.println("area\n" + length * breadth);
    }
}

public class Rectangle {
    public static void main (String args[]) {
        Rectanglee rectangle1 = new Rectanglee();
        Rectanglee rectangle2 = new Rectanglee();

        rectangle1.insert(  5,  10);
        rectangle2.insert(10, 20);
        rectangle1.calculateArea();
        rectangle2.calculateArea();
    }
}

