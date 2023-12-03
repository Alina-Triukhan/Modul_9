public class MyLinkedList<T> implements InterfaceMyLinkedList<T> {
    private int size = 0;
    private Node<T> head;
    private Node<T> last;

    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> prev;

        public Node(Node<T> prev, T value, Node<T> next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

        public T getValue() {
            return value;
        }
    }

    public MyLinkedList() {
        System.out.println("MyLinkedList створений\n");
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public void add(T value) {
        Node<T> currentNode = new Node<>(last, value, null);
        if (size == 0) {
            head = currentNode;
        } else {
            last.next = currentNode;
        }
        last = currentNode;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Елемент не знайдений! Довжина списку: " + size); //IndexOutOfBoundsException
        }
        int k = 0;
        if (index == 0) {
            head = head.next;
            head.prev = null;
            size--;
            return;
        }
        Node<T> currentNode = head;
        Node<T> removeNode = new Node<>(null, null, null);
        while (k != index) {
            k++;
            removeNode = currentNode.next;
        }
        final Node<T> next = removeNode.next;
        final Node<T> prev = removeNode.prev;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            removeNode.prev = null;
        }
        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            removeNode.next = null;
        }
        removeNode.value = null;
        size--;
    }

    @Override
    public void clear() {
        head = last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Елемент не знайдений! Довжина списку: " + size);
        }
        //Намагалась прискорити пошук
        if (index <= size / 2) {
            Node<T> target = head;
            int i;
            for (i = 0; i < index; i++) {
                target = target.next;
            }
            System.out.println("Елемент з індексом " + i + ": " + target.getValue());
            return target.getValue();
        } else {
            Node<T> target = last;
            int i;
            for (i = size - 1; i > index; i--)
                target = target.prev;
            System.out.println("Елемент з індексом " + i + ": " + target.getValue());
            return target.getValue();
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<T> current = head;

        while (current != null) {
            result.append(current.value);
            if (current.next != null) {
                result.append(" <-> ");
            }
            current = current.next;
        }

        result.append("]");
        return result.toString();
    }
}