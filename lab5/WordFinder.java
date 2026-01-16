package lab5;
import java.util.Scanner;
import java.util.regex.*;

public class WordFinder {
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            String letter = "a";
            String text = "Apple banana apricot berry avocado.";


            // Pattern pattern = Pattern.compile("\\b[" + letter.toLowerCase() + letter.toUpperCase() + "][a-zA-Z]*\\b");
            Pattern pattern = Pattern.compile("\\b[a-zA-Z]*[" +letter.toLowerCase() + letter.toUpperCase() +  "]\\b");

            Matcher matcher = pattern.matcher(text);

            while (matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }
}
