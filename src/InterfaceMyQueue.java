public interface InterfaceMyQueue<T> {
    public void add(T value); //додає елемент в кінець/ Повертає true, якщо успіх, IllegalStateException, если в очереди ограниченной емкости нет места
    public void clear(); //очищає колекцію
    public int size(); //повертає розмір колекції
    public T peek(); //повертає перший елемент з черги/  Возвращает null, если очередь пуста
    public T poll(); //повертає перший елемент з черги і видаляє його з колекції/ Возвращает null, если очередь пуста.
}
//Класс ArrayDeque
//ArrayDeque() - создает пустую двунаправленную очередь с вместимостью 16 элементов.
//ArrayDeque(int numElements) - создает пустую двунаправленную очередь с вместимостью numElements.