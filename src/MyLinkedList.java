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

        @Override
        public String toString() {
            return "Node{ value= " + value + ", next= " + next + '}';
        }

//////////// Щоб вивести список з останнього елемента по попередньому////////////
//        @Override
//        public String toString() {
//            return "Node{ value= " + value + ", prev= " + prev + '}';
//        }
    }

    public MyLinkedList() {
        System.out.println("MyLinkedList створений");
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
        Node<T> currentNode = head.next;
        while (currentNode != null) {
            currentNode.value = null;
            currentNode.prev = null;
            currentNode = currentNode.next;
        }
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
            for (int i = 0; i < index; i++) {
                target = target.next;
            }
            return target.getValue();
        } else {
            Node<T> target = last;
            for (int i = size - 1; i > index; i--)
                target = target.prev;
            return target.getValue();
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList (next){" +
                "size=" + size +
                "\n head:  " + head +
                "}\n";
    }

////////////Щоб вивести список з останнього елемента по попередньому////////////

//    @Override
//    public String toString() {
//        return "MyLinkedList (prev){" +
//                "size=" + size +
//                "\n last:  " + last +
//                "}\n";
//    }
}