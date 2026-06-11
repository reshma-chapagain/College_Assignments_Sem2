public class constructor {
    int n;

    public constructor() {
        n = 10;
    }

    public constructor(int i) {
        n = i;
    }

    public static void main(String[] args) {
        constructor obj = new constructor();

        System.out.println(obj.n);
    }
}