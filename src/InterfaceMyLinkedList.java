public interface InterfaceMyLinkedList<T> {
    void add(T item); //додає елемент в кінець
    void remove(int index); //видаляє елемент із вказаним індексом
    void clear(); //очищає колекцію
    int size(); //повертає розмір колекції
    T get(int index); //повертає елемент за індексом
}
