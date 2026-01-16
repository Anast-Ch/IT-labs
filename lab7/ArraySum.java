package lab7;

import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.List;

public class ArraySum {
    public static void main(String[] args){
        int[] arr = new int[20];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        int threads = 2;
        int chunkSize = (arr.length + threads - 1) / threads;

        ExecutorService executor = Executors.newFixedThreadPool(threads);
        List<Future<Integer>> results = new ArrayList<>(threads);

        for(int i = 0; i < threads; i++){
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, arr.length);

            Future<Integer> res = executor.submit(() -> {
                int sum = 0;
                for(int j = start; j < end; j++){
                    sum += arr[j];
                }
                return sum;
            });
            results.add(res);
        }
        executor.shutdown();

        int total = 0;
        for(Future<Integer> el : results){
            try {total += el.get();}
            catch (InterruptedException | ExecutionException e) {
                e.getMessage();
            }
        }
        
        System.out.println("Сумма элементов массива: " + total);
    }
}   
