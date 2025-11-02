package tasks2;
import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String shiftStr = input.substring(input.indexOf("]") + 1).replaceAll("\\D", "");
        int shiftInt = Integer.parseInt(shiftStr);

        int start = input.indexOf("[") + 1;
        int end = input.indexOf("]");
        String arrStr = input.substring(start, end);

        int[] arrInt;
        if (arrStr.isEmpty()) {
            arrInt = new int[0];
        } else {
            String[] arr = arrStr.split(",");
            arrInt = new int[arr.length];
            for (int i = 0; i < arrInt.length; i++) {
                arrInt[i] = Integer.parseInt(arr[i].trim());
            }
        }

        System.out.println(Arrays.toString(rotateRight(arrInt, shiftInt)));

        scanner.close();
    }

    public static int[] rotateRight(int[] arr, int k) {
        if (arr.length == 0){
            return arr;
        }
        
        k = k % arr.length;
        if (k == 0) {
            return arr;
        }

        int[] newArr = new int[arr.length]; 
        for (int i = 0; i < arr.length; i++) {
            if ((i + k) < newArr.length) {
                newArr[i+k] = arr[i];
            }
            else {
                newArr[i+k - arr.length] = arr[i];
            }
        }
        return newArr;
    }
}
