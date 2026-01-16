package lab5;

public class IPException extends Exception{
    public IPException(){
        super("Введенный IP некорректен.");
    }
}
