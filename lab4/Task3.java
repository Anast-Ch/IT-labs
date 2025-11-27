package lab4;
import java.util.*;
import java.io.*;

public class Task3 {
    public static void main(String[] args){
        try{
            int num = inputInt();
            System.out.printf("Введенное число: %d", num);

        } catch (CustomInputMismatchException e){
            System.out.println(e.getMessage());
            wrExc(e);
        } 
    }   

    public static int inputInt() throws CustomInputMismatchException{
        try(Scanner scanner = new Scanner(System.in);){
            System.out.print("Введите целое число: ");
            int in = scanner.nextInt();
            return in;
        } catch (InputMismatchException e) {
            throw new CustomInputMismatchException();
        }
    }

    public static void wrExc(Exception e){
        try(FileWriter f = new FileWriter("D:\\Java\\src\\lab4\\exc.txt", true)){
            String message = e.toString() + "\n";
            f.write(message);
        } catch (IOException ioException) {
            System.out.println("Ошибка записи в файл" + ioException.getMessage());
        }
    }
}
