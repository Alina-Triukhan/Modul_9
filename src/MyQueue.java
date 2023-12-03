public class MyQueue<T> implements InterfaceMyQueue<T>{
    private Node<T>  start;
    private Node<T>  end;
    private int size;

    public MyQueue() {
        System.out.println("MyQueue створений\n");
        this.start = null;
        this.end = null;
        this.size = 0;
    }

    private static class Node<T> {
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (start == null) {
            start = node;
            end = node;
        }
        if (end != null) {
            end.next = node;
        }
        end = node;
        size++;
    }

    @Override
    public void clear() {
        start = null;
        end = null;
        size = 0;
    }

    @Override
    public int size() {
        System.out.println("Довжина черги: " + size);
        return size;
    }

    @Override
    public T peek() {
        if (size == 0) {
            return null;
        } else {
            System.out.println("Перший елемент: " + start.value);
            return start.value;
        }
    }

    @Override
    public T poll() {
        if (size == 0) {
            return null;
        }
        Node<T> node = start;
        if (start.next == null) {
            end = null;
        }
        start = start.next;
        size--;
        System.out.println("Видаляємо елемент: " + node.value);
        return node.value;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder result = new StringBuilder("[");
        Node<T> current = start;
        while (current != null) {
            result.append(current.value);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return "Черга: " + result + ", Довжина черги: " + size;
    }
}