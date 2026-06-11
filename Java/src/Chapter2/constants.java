package Chapter2;

public class constants {
    //Constant declaration
    public static final double PI  = 3.14159;
    public static final String application_name = "myapp";
    public static final int max_users = 100;

    public static void main(String[] args) {
        //using the Chapter2.constants
        System.out.println("value of PI: " + PI);
        System.out.println("App Name: " + application_name);
        System.out.println("Max Users: " + max_users);

        //this would cause a comilation error if uncommented
        //Pi = 3.14 // cant assign a value to final variable pi

    }
}
