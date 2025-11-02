/*Создайте программу, которая возвращает сумму всех целых чисел на отрезке [a, b] включительно. 
Гарантируется, что a ≤ b.*/

package tasks2;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] ab = scanner.nextLine().split(",");
        int a = Integer.parseInt(ab[0].trim());
        int b = Integer.parseInt(ab[1].trim());
        System.out.println(sumRange(a, b));
        scanner.close();
    }

    public static int sumRange(int a, int b) {
        int d = b - a + 1;
        return d * (a + b) / 2;
    }
}
