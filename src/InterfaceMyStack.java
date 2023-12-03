public interface InterfaceMyStack<T> { //LIFO
    void push(T value); //додає елемент в кінець
    void remove(int index); //видаляє елемент за індексом
    void clear(); //очищає колекцію
    int size(); //повертає розмір колекції
    T peek(); //повертає перший елемент стеку
    T pop(); //повертає перший елемент стеку та видаляє його з колекції
}
