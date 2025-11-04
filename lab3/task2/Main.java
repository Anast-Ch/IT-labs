package lab3.task2;

public class Main {
    public static void main(String[] args){
        OrderTable table = new OrderTable();
        table.putOrder(1, "pizza", 10, 15, 3);
        table.putOrder(1, "a", 12, 17, 30);

        table.getOrder(1);

        table.removeOrder(1);

        table.getOrder(0);

        table.removeOrder(1);
    }
}
