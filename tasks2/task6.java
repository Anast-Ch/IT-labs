package tasks2;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrStr = scanner.nextLine().split(",");

        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i].trim());
        }

        System.out.println(clamp(arrInt[0], arrInt[1], arrInt[2]));

        scanner.close();
    }

    public static int clamp(int val, int min, int max) {
        if (val > max) {
            return max;
        } else if (val < min) {
            return min;
        } else {
            return val;
        }
    }
}
