package lab7;

import java.util.*;
import java.util.concurrent.*;

public class Warehouse {
    private static final int MAX_WEIGHT = 150;
    private static final int NUMBER_OF_WORKERS = 3;
    private static int carriedWeight = 0;
    private static final Queue<Integer> warehouse = new ConcurrentLinkedQueue<>(Arrays.asList(24, 25, 50, 33, 64, 32, 41, 13, 22, 36));

    public static void main(String[] args) {

        System.out.println("Веса товаров на складе: " + warehouse);

        ExecutorService executor = Executors.newFixedThreadPool(NUMBER_OF_WORKERS);
        CompletionService<Integer> completionService = new ExecutorCompletionService<>(executor);

        int iterations = 0;
        int totalTransferred = 0;
        
        while (!warehouse.isEmpty()) {
            iterations++;
            carriedWeight = 0;

            System.out.println("\nИтерация " + iterations);

            for (int i = 1; i <= NUMBER_OF_WORKERS; i++) {
                final int workerId = i;

                completionService.submit(() -> {
                    int localCarriedWeight = 0;

                    Integer item;
                    while ((item = getItemForWorker()) != null) {

                        localCarriedWeight += item;

                        System.out.println("Грузчик " + workerId + " взял товар весом " + item +
                                " кг. Общий вес его товаров: " + localCarriedWeight + " кг");
                    }

                    if (localCarriedWeight > 0) {
                        System.out.println("Грузчик " + workerId + " несет товары.");
                        System.out.println("Грузчик " + workerId + " разгрузил товары.");
                    }

                    return localCarriedWeight;
                });
            }

            int iterationWeight = 0;

            for (int i = 0; i < NUMBER_OF_WORKERS; i++) {
                try {
                    Future<Integer> result = completionService.take();
                    iterationWeight += result.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.getMessage();
                }
            }

            totalTransferred += iterationWeight;
            System.out.println("Итерация " + iterations + " завершена. Перенесено: " +
                    iterationWeight + " кг. Осталось товаров: " + warehouse.size());
        }
    
        executor.shutdown();
        

        System.out.println("\nВсе товары перенесены за " + iterations + " итераций");
        System.out.println("Общий перенесенный вес: " + totalTransferred + " кг");
    }

    private static synchronized Integer getItemForWorker() {
        Integer nextItem = warehouse.peek();
        if (nextItem == null)
            return null;

        if (carriedWeight + nextItem > MAX_WEIGHT) {
            return null;
        }

        warehouse.poll(); 
        carriedWeight += nextItem;
        
        return nextItem;
    }
}