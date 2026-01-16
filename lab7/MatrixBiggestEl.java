package lab7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
;
public class MatrixBiggestEl {
    public static void main(String[] args){
        int[][] matrix = {
            {3, 3, 8}, 
            {9, 10, 89}, 
            {13, 33, 56}
        };
        
        ExecutorService executor = Executors.newFixedThreadPool(matrix.length);
        List<Future<Integer>> results = new ArrayList<>(matrix.length);

        for(int i = 0; i < matrix.length; i++){
            int str = i;
            Future<Integer> res = executor.submit(() -> {
                int max = Integer.MIN_VALUE;
                for(int j = 0; j < matrix[str].length; j++){
                    if (matrix[str][j] > max) max = matrix[str][j];
                }
                return max;
            });
            results.add(res);
        }
        executor.shutdown();

        int max = Integer.MIN_VALUE;
        for(Future<Integer> el : results){
            try {
                if (el.get() > max) max = el.get();
            } catch(InterruptedException | ExecutionException e){
                e.getMessage();
            }   
        }

        System.out.println("Наибольший элемент матрицы: " + max);
    }
}
