package lab5;

public class PasswException extends Exception {
    public PasswException(){
        super("Ошибка. Введенный пароль не соответсвует требованиям.");
    }
}
