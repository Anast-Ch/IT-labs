package lab5;
import java.util.regex.*;

public class ExprSearch {
    public static void main(String[] args){
        String str = "helloWorld exampleTest фФ";

        Pattern pattern = Pattern.compile("[a-zа-я][A-ZА-Я]");
        Matcher matcher = pattern.matcher(str);
        
        String res = matcher.replaceAll("!$0!");

        System.out.println(res);
    }
}
