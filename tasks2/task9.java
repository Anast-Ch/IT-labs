package tasks2;
import java.util.Arrays;
import java.util.Scanner;


public class task9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replaceAll("\\],", ";").replaceAll("\\[", " ");
        String[] arr = input.substring(0, input.length() - 1).split(";");


        int[] a;
        int[] b;
        if (arr[0].trim().isEmpty()) {
            a = new int[0];
        } else {
            String[] arr1 = arr[0].trim().split(","); 
            a = new int[arr1.length];
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(arr1[i].trim());
            }
        }

        if (arr[1].trim().isEmpty()) {
            b = new int[0];
        } else {
            String[] arr2 = arr[1].trim().split(","); 
            b = new int[arr2.length];
            for (int i = 0; i < b.length; i++) {
                b[i] = Integer.parseInt(arr2[i].trim());
            }
        }
        
        System.out.println(Arrays.toString(mergeUniqueSorted(a, b)).replace(" ", ""));

        scanner.close();
    }

    public static int[] mergeUniqueSorted(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        Arrays.sort(c);
    
        int uniqueCount = 0;
        if (c.length > 0) {
            uniqueCount = 1;
            for (int i = 1; i < c.length; i++) {
                if (c[i] != c[i - 1]) {
                    uniqueCount++;
                }
            }
        }
        
        int[] result = new int[uniqueCount];
        
        if (c.length > 0) {
            result[0] = c[0];
            int resultIndex = 1;
            for (int i = 1; i < c.length; i++) {
                if (c[i] != c[i - 1]) {
                    result[resultIndex] = c[i];
                    resultIndex++;
                }
            }
        }
        
        return result;
        
    }
}
