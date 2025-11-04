package lab3;

import java.util.LinkedList;

public class HashTable<K, V>{
    private int size;
    private int capacity;
    private LinkedList<Entry<K, V>>[] table;

    public static class Entry<K, V>{
        final K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int hashCode(){
        if (this.key == null){
            return 0;
        }
        return this.key.hashCode();
        }

        @Override 
        public boolean equals(Object obj){
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Entry<?, ?> other = (Entry<?, ?>) obj;
            return this.key.equals(other.key);
        }

        public K getKey(){
            return this.key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public V getValue(){
            return this.value;
        }
    }

    @SuppressWarnings("unchecked")
    public HashTable(int capacity){
        this.table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
        size = 0;
        this.capacity = capacity;
        
    }

    @SuppressWarnings("unchecked")
    public HashTable(){
        capacity = 16;
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
        size = 0;
        
    }

    public int hash(K key) {
        if (key == null) {return 0;}

        int index = key.hashCode();
        return index % capacity;
    }

    public void put(K key, V value){
        int index = hash(key);

        if (table[index] == null){
            table[index] = new LinkedList<Entry<K, V>>();
        }

        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)){
                entry.setValue(value);
                return;
            }
        }
        table[index].add(new Entry<K, V>(key, value));
        this.size++;
    }

    public V get(K key) {
        int index = hash(key);
        if (table[index] == null){
            return null;
        }
        for (int i = 0; i < table[index].size(); i++){
            if (table[index].get(i).getKey().equals(key)){
                return table[index].get(i).getValue();
            }
        }
        return null;
    }

    public int remove(K key) {
        int index = hash(key);

        if (table[index] == null){
            return 0;
        }

        for (int i = 0; i < table[index].size(); i++){
            if (table[index].get(i).getKey().equals(key)){
                table[index].remove(i);
                this.size -= 1;
                return 1;
            }
        }
        return 0;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if (this.size == 0){
            return true;
        }
        return false;
    }
}

