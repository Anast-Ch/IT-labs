package lab4;
import java.io.*;

public class Task2 {
    public static void main(String[] args){
        try(FileInputStream f1 = new FileInputStream("D:\\Java\\src\\lab4\\file.txt"); 
        FileOutputStream f2 = new FileOutputStream("C:\\Windows\\System32\\test_file.txt")){

            int r;
            while((r = f1.read())!= -1){
                f2.write(r);
            }

            System.out.println("Файл успешно скопирован!");
        }
        catch(FileNotFoundException  e){
            System.out.println("Файл не найден: " + e.getMessage());
        }
        catch (IOException  e){
            System.out.println("Ошибка чтения/записи файла: " + e.getMessage());
        }
    }
}
