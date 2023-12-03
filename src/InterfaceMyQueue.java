public interface InterfaceMyQueue<T> { //FIFO
    void add(T value); //додає елемент в кінець
    void clear(); //очищає колекцію
    int size(); //повертає розмір колекції
    T peek(); //повертає перший елемент з черги
    T poll(); //повертає перший елемент з черги і видаляє його з колекції
}
//Класс ArrayDeque
//ArrayDeque() - создает пустую двунаправленную очередь с вместимостью 16 элементов.
//ArrayDeque(int numElements) - создает пустую двунаправленную очередь с вместимостью numElements.