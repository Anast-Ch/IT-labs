package tasks2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = scanner.nextLine().split(",");

        scanner.close();

        int[] intArr = new int[strArr.length];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i].trim());
        }

        System.out.println(hasDuplicates(intArr));
    }

    public static boolean hasDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
