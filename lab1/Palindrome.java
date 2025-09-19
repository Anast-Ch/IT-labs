public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            
            if (isPalindrome(s)) {
                System.out.print("Строка " + s + " является палиндромом.\n");
            } else {
                System.out.print("Строка " + s + " не является палиндромом.\n");
            }
        }
    }

    public static String reverseString(String str) {
        String revStr = "";
        for (int i = str.length() -1; i >= 0; i--) {
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
