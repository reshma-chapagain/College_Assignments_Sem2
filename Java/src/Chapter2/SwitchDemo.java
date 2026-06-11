package Chapter2;

public class SwitchDemo {
    public static void main (String[] args) {
        int days = 3;
        String day;
        switch  (days) {
            case 1 : day = "monday";
            break;
            case 2 : day = "tuesday";
            break;
            case   3 : day = "wednesday";
            break;
            case 4 : day = "thursday";
            break;
            case 5 : day = "friday";
            break;
            case 6 : day = "saturday";
            break;
            case 7 : day = "sunday";
            break;
            default: day = "holiday";
            break;
        }
        System.out.println(day);
    }
}
