import java.util.Arrays;

public class MyArrayList<T> implements InterfaceMyArrayList<T> {
    private final int CAPACITY = 10;
    private final int LOWER = 4;
    private int arraySize = 0;
    private Object[] array = new Object[CAPACITY];
    public MyArrayList() {
        System.out.println("MyArrayList створений\n");
    }

    @Override
    public void add(T item) {
        if (arraySize == array.length - 1)
            resize(array.length * 2/3);
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
        if (array.length > CAPACITY && arraySize < array.length / LOWER)
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
        return arraySize;
    }

    @Override
    public T get(int index) {
        if (index >= arraySize || index < 0) {
            throw new IndexOutOfBoundsException("Елемент не знайдений! Довжина списку: " + arraySize);
        } else {
            @SuppressWarnings("unchecked")
            T arrayElement = (T) array[index];
            return arrayElement;
        }
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, arraySize);
        array = newArray;
    }
}