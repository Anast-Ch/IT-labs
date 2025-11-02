package tasks2;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(grade(a));
        scanner.close();
    }

    public static String grade(int a) {
        if (90 <= a && a <= 100) {return "A";}
        if (80 <= a && a <= 89) {return "B";}
        if (70 <= a && a <= 79) {return "C";}
        if (60 <= a && a <= 69) {return "D";}
        if (0 <= a && a <= 59) {return "F";}
        else {return "Invalid";}
    }
}
