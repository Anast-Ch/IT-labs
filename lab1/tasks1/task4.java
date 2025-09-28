package tasks1;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        System.out.println(isEven(n));
        scanner.close();
    }

    public static boolean isEven(int num){
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
