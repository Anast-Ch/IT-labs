package lab4;

public class CustomInputMismatchException extends Exception {

     public CustomInputMismatchException(){
        super("Введенное значение не является числом.");
     }

}
