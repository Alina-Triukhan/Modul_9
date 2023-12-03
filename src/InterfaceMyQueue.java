public interface InterfaceMyQueue<K, V> {
    public void add(Object value); //додає елемент в кінець
    public void clear(); //очищає колекцію
    public int size(); //повертає розмір колекції
    public K peek(); //повертає перший елемент з черги
    public K poll(); //повертає перший елемент з черги і видаляє його з колекції
}
