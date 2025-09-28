package tasks1;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        a = digitSum(a);
        System.out.println(a);
        scanner.close();
    }

    public static int digitSum(int num){
        int sum = 0;
        while (Math.abs(num) >= 1) {
            sum += (Math.abs(num) % 10);
            num /= 10;
        }
        return sum;
    }
}
