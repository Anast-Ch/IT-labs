package tasks2;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strNums = scanner.nextLine().split(",");

        scanner.close();

        int[] intNums = new int[strNums.length];

        for (int i = 0; i < intNums.length; i++) {
            intNums[i] = Integer.parseInt(strNums[i].trim());
        }

        System.out.println(sumOfPositives(intNums));
    }

    public static int sumOfPositives(int[] arr){
        int sum = 0;
        for (int num : arr) {
            if (num > 0){
                sum += num;
            }
        }
        return sum;
    }
}
