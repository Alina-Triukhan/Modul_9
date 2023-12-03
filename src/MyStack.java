public class MyStack<T> implements InterfaceMyStack<T> {
    private Node<T> head;
    private int size;

    public MyStack() {
        System.out.println("MyStack створений\n");
        this.head = null;
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
        Node<T> newNode = new Node<>(value);
        newNode.prev = head;
        head = newNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (index == 0) {
            head = head.prev;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.prev;
            }
            current.prev = current.prev.prev;
        }
        size--;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        System.out.println("Довжина стеку: " + size);
        return size;
    }

    @Override
    public T peek() {
        if(size == 0) {
            return null;
        }
        System.out.println("Перший елемент: " + head.value);
        return head.value;
    } //повертає перший елемент стеку

    @Override
    public T pop() {
        if (size == 0) {
            return null;
        }
        T node = head.value;
        head = head.prev;
        size--;
        System.out.println("Видаляємо перший елемент: " + head.value);
        return node;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder result = new StringBuilder("[");
        Node<T> current = head;
        while (current != null) {
            result.append(current.value);
            if (current.prev != null) {
                result.append(", ");
            }
            current = current.prev;
        }
        result.append("]");
        return "Стек: " + result + ", Довжина стеку: " + size;
    }
}
