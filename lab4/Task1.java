package lab4;

public class Task1 {
    public static void main(String[] args){
        Object[] arr= {1, 2, 3, 4, 5};
        int sum = 0;
        
        try{
            for (Object i: arr){
                sum += (int) i;
            }
            // arr[arr.length] = 4;
            System.out.printf("Среднее арифметическое массива равно: %.2f", (float) sum/arr.length);
        } catch (ClassCastException __){
            System.out.println("Неверный тип данных (не число).");
        } catch (ArrayIndexOutOfBoundsException __){
            System.out.println("Выход за границы массива.");
        }
    }
}

