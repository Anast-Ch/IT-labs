package lab5;
import java.util.Scanner;
import java.util.regex.*;

public class PasswordCheck {

    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile("^(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]{8,16}$");
            Matcher matcher = pattern.matcher(input);
            if (matcher.find() == false){
                throw new PasswException();
            } 

            System.out.printf("Заданный пароль: %s\n", input);
            
        } catch(PasswException e){
            System.out.println(e.getMessage());
        }
    }
    

}
