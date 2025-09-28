package tasks1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tempC = scanner.nextInt();

        int tempF = toFahrenheit(tempC);
        System.out.print(tempF);
        scanner.close();
    }
    

    public static int toFahrenheit(int C) {
        int F = (C * 9)/5 + 32;
        return F;
}
}

