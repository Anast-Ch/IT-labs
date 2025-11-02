//Создайте программу, которая возвращает количество делителей положительного числа n (включая 1 и само число).

package tasks2;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        while (num <= 0) {
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("Ошибка. Число должно быть положительным.");
            } 
    }
    scanner.close();

    System.out.println(cntDivs(num));
    }

    public static int cntDivs(int num) {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cnt += 1;
            }
        }
        return cnt;
    }
}
