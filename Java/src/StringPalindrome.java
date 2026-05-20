public class StringPalindrome {
public static void main(String[] args) {
    String text = "ram";
    char [] array = text.toCharArray();

    int left = 0;
    int right = array.length - 1;
    boolean isPalindrome = true;

    while (left< right){
        if (array[left] != array[right]){
            isPalindrome= false;
            break;
        }

        left ++;
        right --;
    }
    if(isPalindrome) {
        System.out.println("Its palindrome");
    }

    else {
        System.out.println("It aint palindrome");
    }

}

}
