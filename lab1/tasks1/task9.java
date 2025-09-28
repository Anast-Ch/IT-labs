package tasks1;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        System.out.println(isPrime(val));

        scanner.close();
    }

    public static boolean isPrime(int val) {

        if (val == 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(val); i++){
            if (val % i == 0) {
                return false;
            } 
        }
        return true;
        
    }
}
