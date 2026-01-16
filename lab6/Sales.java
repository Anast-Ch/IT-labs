package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Sales {
    private CopyOnWriteArrayList<String> products;

    public Sales(){
        products = new CopyOnWriteArrayList<>();
    }

    public void addProduct(String product){
        products.add(product);
    }

    public void getInfoSales(){
        if (products.size() != 0){
            System.out.println("Список проданных товаров.");
            for(int i = 0; i < products.size(); i++){
                System.out.println(i+1 + ". " + products.get(i));
            }
        } else System.out.println("Список пуст.");
    }

    public int totalSales(){
        return products.size();
    }

    public List<String> mostPopularProduct(){
        List<String> result = new ArrayList<>();
        if (products.size() == 0) return result;

        List<String> sorted = new ArrayList<>(products); 
        Collections.sort(sorted);

        int maxCnt = 1;
        int curCnt = 1;
        result.add(sorted.getFirst());
        for(int i = 1; i < sorted.size(); i++){
            if (sorted.get(i).equals(sorted.get(i-1))){
                curCnt += 1;
            } else curCnt = 1;

            if (curCnt > maxCnt){
                maxCnt = curCnt;
                result.clear();
                result.add(sorted.get(i));
            } else if (curCnt == maxCnt){
                result.add(sorted.get(i));
            }
        }

        return result;
    }
}
