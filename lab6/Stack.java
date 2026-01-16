package lab6;

public class Stack<T> {
    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public Stack(int capacity){
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public void push(T el){
        if (size != data.length){
            data[size] = el;
            size+=1;
        } else System.out.println("Невозможно добавить. Стек полностью заполнен.");
        
    }

    public T pop(){
        if (size != 0){
            T val = data[size-1];
            data[size-1] = null;
            size-=1;
            return val;
        } else{
            return null;
        }
    }

    public T peek(){
        if (size!=0) return data[size-1];
        else {
            return null;
        }
    }
}
