public interface InterfaceMyHashMap<K, V> {
    void put(K key, V value); //додає пару ключ + значення
    void remove(K key); //видаляє пару за ключем
    void clear(); //очищає колекцію
    int size(); //повертає розмір колекції
    V get(K key); //повертає значення (V value) за ключем
}
