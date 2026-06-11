package Chapter2;

public class Point {
    int x,y;
    public void setPoint(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    public void display() {
        System.out.println("X:" + this.x + "Y:" + this.y);
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.x =100;
        p.y = 100;


        p.setPoint(p);
        p.display();
    }
}
