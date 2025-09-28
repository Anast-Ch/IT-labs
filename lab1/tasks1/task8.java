package tasks1;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(isPalindrome(str));

        scanner.close();
    }

    public static String reverseString(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;
    }

    public static boolean isPalindrome(String s) {
        String revStr = reverseString(s);
        if (s.equals(revStr)) {
            return true;
        } else {
            return false;
        }
    }
}
