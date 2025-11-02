package tasks2;
import java.util.Scanner;
import java.lang.Math;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val = scanner.nextInt();
        
        int[] arr = countEvenOddDigits(val);
        System.out.println(arr[0] + ", " + arr[1]);

        scanner.close();
    }

    public static int[] countEvenOddDigits(int val) {
        int cntEven = 0, cntOdd = 0;
        val = Math.abs(val);

        if (val == 0){
            cntEven = 1;
        }
        
        while(val > 0) {
            if (val % 10 % 2 == 0) {
                cntEven += 1;
            } else {
                cntOdd += 1;
            }
            val /= 10;
        }
        return new int[]{cntEven, cntOdd};
    }
}
