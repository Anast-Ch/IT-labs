package tasks1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        double S = rectangleArea(length, width);
        System.out.println(S);
        scanner.close();
    }

    public static double rectangleArea(double l, double w){
        double S = l * w;
        return S;
    }
}
