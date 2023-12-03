public interface InterfaceMyHashMap<K, V> {
    public void put(K key, V value); //додає пару ключ + значення
    public void remove(K key); //видаляє пару за ключем
    public void clear(); //очищає колекцію
    public int size(); //повертає розмір колекції
    public V get(K key); //повертає значення (Object value) за ключем
}
