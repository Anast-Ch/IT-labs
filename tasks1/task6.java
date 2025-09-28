package tasks1;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        System.out.println(checkAge(age));

        scanner.close();
    }

    public static String checkAge(int val){
        if (val >= 18) {
            return "совершеннолетний";
        } else {
            return "несовершеннолетний";
        }
    }
}
