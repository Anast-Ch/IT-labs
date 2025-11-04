package lab3.task1;

public class Main {
    public static void main(String[] args){
        HashTable<String, String> table = new HashTable<>();

        String key1 = "AB";
        String key2 = "BA";
        String key3 = "AC";
        
        System.out.println("Хеш ключа 'AB': " + key1.hashCode());
        System.out.println("Хеш ключа 'BA': " + key2.hashCode());
        System.out.println("Хеш ключа 'AC': " + key3.hashCode());
        
        System.out.println("Индекс массива 'AB': " + table.hash(key1));
        System.out.println("Индекс массива 'BA': " + table.hash(key2));
        System.out.println("Индекс массива 'AC': " + table.hash(key3));

        table.put(key1, "ab");
        table.put(key2, "ba"); 
        table.put(key3, "ac");
        
        System.out.println("\nПосле добавления ключей:");
        System.out.println("Элемент по 'AB' = " + table.get("AB"));
        System.out.println("Элемент по 'BA' = " + table.get("BA"));
        System.out.println("Элемент по 'AC' = " + table.get("AC"));
        System.out.println("Размер таблицы: " + table.size());
        
        System.out.println("\n Тест перезаписи");
        table.put("AB", "AbA");
        System.out.println("После перезаписи 'AB': " + table.get("AB"));
        
        System.out.println("\nТест удаления");
        table.remove("BA");
        System.out.println("После удаления 'BA':");
        System.out.println("Элемент по 'AB' = " + table.get("AB"));
        System.out.println("Элемент по 'BA' = " + table.get("BA"));
        System.out.println("Элемент по 'AC' = " + table.get("AC"));
    }
    
}
