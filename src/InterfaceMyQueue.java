public interface InterfaceMyQueue<T> {
    public void add(T value); //додає елемент в кінець
    public void clear(); //очищає колекцію
    public int size(); //повертає розмір колекції
    public T peek(); //повертає перший елемент з черги
    public T poll(); //повертає перший елемент з черги і видаляє його з колекції
}
