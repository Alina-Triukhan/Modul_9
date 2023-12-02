public interface InterfaceMyLinkedList<T> {
    public void add(T item); //додає елемент в кінець
    public void remove(int index); //видаляє елемент із вказаним індексом
    public void clear(); //очищає колекцію
    public int size(); //повертає розмір колекції
    public T get(int index); //повертає елемент за індексом
}
