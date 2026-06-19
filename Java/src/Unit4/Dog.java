package Unit4;
 class Animal {
    String color = "white";
}
    class Dog extends Animal{
        String color = "red" ;
        void Printcolor() {
            System.out.println(color);
            System.out.println(super.color);
        }
    }

    class TestSuper{
        public static void main(String args[]) {
            Dog d = new Dog();
            d.Printcolor();
        }
    }

