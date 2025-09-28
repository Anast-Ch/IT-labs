package tasks1;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        String weeks = daysToWeeks(days);
        System.out.println(weeks);

        scanner.close();
    }

    public static String daysToWeeks(int num){
        int weeks = num / 7;
        int days = num % 7;
        
        String res = Integer.toString(weeks);
        if (weeks % 100 > 10 & weeks % 100 < 20 || weeks % 10 > 4 & weeks % 10 < 10 || weeks % 10 == 0) {
            res += " недель и ";
        } else if (weeks % 10 == 1) {
            res += " неделя и ";
        } else if (weeks % 10 >= 2 & weeks % 10 <= 4) {
            res += " недели и ";
        }

        res += Integer.toString(days);

        if (days % 10 == 1) {
            res += " день";
        } else if (days % 10 >= 2 & days % 10 <= 4){
            res += " дня";
        } else if (days % 10 == 5 || days % 10 == 6 || days == 0){
            res += " дней";
        }

        return res;
    }
}
