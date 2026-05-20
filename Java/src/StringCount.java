//WAP to get the number of words available in the text :
// I am earth . People can live in earth. People can breathe after staying in earth
//Expected output: - earth = 3 , people = 2 tip: use string line
import java.util.Arrays;
public class StringCount {
    public static void main(String args[]) {
        String text = "I am earth planet";
        String[] array = text.split(" ");
        System.out.println("String Array ::: First Name " + array[2]);
        System.out.println("String Array ::: Last Name" + array[3]);

    }
}
