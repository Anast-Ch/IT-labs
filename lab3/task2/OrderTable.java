package lab3.task2;

import java.util.HashMap;

public class OrderTable {
    private HashMap<Integer, Order> orderTable;

    public OrderTable(){
        orderTable = new HashMap<Integer, Order>();
    }

    public boolean putOrder(int num, String meals, int cost, int h, int m){
        if (num <= 0) {
            System.out.println("Ошибка: номер столика должен быть положительным числом");
            return false;
        }

        if (orderTable.containsKey(num)){
            System.out.println("Ошибка: заказ для столика №" + num + " уже существует");
            return false;
        }
        orderTable.put(num, new Order(meals, cost, h, m));
        System.out.println("Заказ для столика №" + num + " успешно добавлен");
        return true;
    }

    public Order getOrder(int num){
        Order order = orderTable.get(num);
        if (order == null) {
            System.out.println("Заказ для столика №" + num + " не найден");
        } else {
            System.out.println("Найден заказ: " + order.getInfo());
        }
        return order;
    }

    public boolean removeOrder(int num){
        Order order = orderTable.remove(num);
        if (order == null) {
            System.out.println("Заказ для столика №" + num + " не найден");
            return false;
        } else {
            System.out.println("Заказ для столика №" + num + " успешно удален");
            return true;
        }
    }
}
