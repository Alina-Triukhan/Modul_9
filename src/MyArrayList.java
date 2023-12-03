import java.util.Arrays;

public class MyArrayList<T> implements InterfaceMyArrayList<T> {
    private final int CAPACITY = 10;
    private int arraySize;
    private Object[] array;
    public MyArrayList() {
        System.out.println("MyArrayList створений\n");
        this.array = new Object[CAPACITY];
        this.arraySize = 0;
    }

    @Override
    public void add(T item) {
        if (arraySize == array.length)
            resize(array.length * 2);
        array[arraySize++] = item;
    }

    @Override
    public void remove(int index) {
        if (index >= arraySize || index < 0) {
            throw new IndexOutOfBoundsException("Елемент не знайдений! Довжина списку: " + arraySize);
        }
        for (int i = index; i < arraySize; i++)
            array[i] = array[i + 1];
        array[arraySize] = null;
        arraySize--;
        if (array.length > CAPACITY && arraySize < array.length / 4)
            resize(array.length / 2);
    }

    @Override
    public void clear() {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = null;
//        }
        Arrays.fill(array, null);
        arraySize = 0;
    }

    @Override
    public int size() {
        System.out.println("Розмір: " + arraySize);
        return arraySize;
    }

    @Override
    public T get(int index) {
        if (index >= arraySize || index < 0) {
            throw new IndexOutOfBoundsException("Елемент не знайдений! Довжина списку: " + arraySize);
        } else {
            @SuppressWarnings("unchecked")
            T arrayElement = (T) array[index];
            System.out.println("Елемент з індексом " + index + ": " + array[index]);
            return arrayElement;
        }
    }

    private void resize(int newLength) {
        array = Arrays.copyOf(array, newLength);
    }

    @Override
    public String toString() {
        if (arraySize == 0) {
            return "[]  Масив порожній.";
        }
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < arraySize - 1; i++) {
            result.append(array[i]).append(", ");
        }
        result.append(array[arraySize - 1]).append("]  Довжина масиву: ").append(arraySize).append("; ");
        return  result.toString();
    }
}