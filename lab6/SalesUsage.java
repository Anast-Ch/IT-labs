package lab6;

import java.util.List;

public class SalesUsage {
    public static void main(String[] args){
        Sales sales = new Sales();
        sales.getInfoSales();
        sales.addProduct("Пылесос");
        sales.addProduct("Телефон");
        sales.addProduct("Пылесос");
        sales.addProduct("Телефон");
        sales.addProduct("Планшет");
        sales.getInfoSales();
        popularProdPrint(sales.mostPopularProduct());
        sales.addProduct("Телефон");
        sales.getInfoSales();
        popularProdPrint(sales.mostPopularProduct());  
    }

    public static void popularProdPrint(List<String> s){
        if (s.size() > 1){
            System.out.print("Наиболее популярные товары: ");
            for (String el : s){
                System.out.print(el + " ");
            }
            System.out.print("\n");
        } else if (s.size() == 0) System.out.println("Список пуст");
        else System.out.println("Наиболее популярный товар - " + s.getFirst());
    }
}
