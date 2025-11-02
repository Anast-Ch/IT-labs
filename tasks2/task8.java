package tasks2;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll("\\],", ";").replaceAll("\\[", "");
        String[] arr = input.substring(0, input.length() - 2).trim().split(";");

        int[][] matrix = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for(String val : arr[i].split(",")){
                matrix[i][j] = Integer.parseInt(val);
                j += 1;
            }
        }
        
        System.out.println(diagonalSum(matrix));
        scanner.close();
    }

    public static int diagonalSum(int[][] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i][i];
    }
    return sum;
    }
}
