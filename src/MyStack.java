public class MyStack<T> implements InterfaceMyStack<T> {
    private final Node<T> start;
    private final Node<T> end;
    private final int size;

    public MyStack() {
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    private static class Node<T> {
        T value;
        Node<T> prev;

        public Node(T value) {
            this.value = value;
            this.prev = null;
        }

    }
    @Override
    public void push(T value) {

    }//додає елемент в кінець

    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        return null;
    } //повертає перший елемент стеку

    @Override
    public T pop() {
        return null;
    } //повертає перший елемент стеку та видаляє його з колекції
}
