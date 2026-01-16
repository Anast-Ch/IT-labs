package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.*;

public class TopWords {
    public static void main(String[] args) {
        String filePath = "D:\\Java\\src\\lab6\\text.txt";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(file)){
            Map<String, Integer> wordsCntMap = new HashMap<>();
            
            while(scanner.hasNext()){
                String line = scanner.nextLine();

                Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");
                Matcher matcher = pattern.matcher(line);
                while(matcher.find()){
                    String word = matcher.group();
                    if(wordsCntMap.containsKey(word.toLowerCase())) {
                        wordsCntMap.put(word.toLowerCase(), wordsCntMap.get(word.toLowerCase()) + 1);
                    } else wordsCntMap.put(word.toLowerCase(), 1);
                }
            }

            ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>();
            for(Map.Entry<String,Integer> entry: wordsCntMap.entrySet()){
                list.add(entry);
            }

            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
                @Override
                public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2){

                    int valCompare = -Integer.compare(entry1.getValue(), entry2.getValue());

                    if (valCompare == 0){
                        return entry1.getKey().compareTo(entry2.getKey());
                    }
                    return valCompare;
                }
            });

            System.out.println("Топ-10 слов.");
            int ind = 1;
            Iterator<Map.Entry<String, Integer>> iterator = list.iterator();
            while(iterator.hasNext() && ind <= 10){
                Map.Entry<String, Integer> entry = iterator.next();
                System.out.printf("%d. %s (кол-во повторений: %d)\n", ind, entry.getKey(), entry.getValue());

                ind+=1;
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
