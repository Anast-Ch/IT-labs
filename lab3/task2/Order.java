package lab3.task2;
import java.time.LocalTime;

public class Order {
    private String meals;
    private int cost;
    private LocalTime time;

    public Order(String meals, int cost, int h, int m){
        this.meals = meals;
        if (cost < 0){
            throw new IllegalArgumentException("Ошибка: Стоимость заказа должна быть положительной. Передано: " + cost);
        } else{this.cost = cost;}
        
        if (h<0 || h>23){throw new IllegalArgumentException("Ошибка: часы введены неверно.");}
        if (m<0 || m>59){throw new IllegalArgumentException("Ошибка: минуты введены неверно.");}

        time = LocalTime.of(h, m);
    }


    public Order(){
        this(null, 0, 0, 0);
    }

    public String getMeals(){return meals;}

    public int getCost(){return cost;}

    public LocalTime getTime(){return time;}

    public void setMeals(String meals){this.meals = meals;}

    public void setCost(int cost){
        if (cost < 1){
            System.out.println("Ошибка. Стоимость должна быть положительной.");
        }
        this.cost = cost;
    }

    public void setTime(int h, int m){
        time = LocalTime.of(h, m);
    }

    public String getInfo(){
        return String.format("Блюда: %s. Цена: %d. Время: %tR", meals, cost, time);
    }
        
}
