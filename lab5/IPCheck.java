package lab5;
import java.util.Scanner;
import java.util.regex.*;


public class IPCheck {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            String ipAdress = scanner.nextLine();

            Pattern pattern = Pattern.compile("^((\\d|[1-9]\\d|1\\d{2}|2[0-5]{2})\\.){3}(\\d|[1-9]\\d|[1-9]\\d{2}|2[0-5]{2})$");
            Matcher matcher = pattern.matcher(ipAdress);

            if (matcher.find() == false){
                throw new IPException();
            }

            System.out.printf("Введенный IP: %s \n", ipAdress);
        } catch (IPException e){
            System.out.println(e.getMessage());
        }
    }
}
