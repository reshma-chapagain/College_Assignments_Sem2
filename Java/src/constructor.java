public class constructor {
    int n;
    public constructor(int i) {
        this.n = 10;
    }

    public static void main(String[] args) {
        constructor obj = new constructor();

        System.out.println(obj.n);
    }
}
