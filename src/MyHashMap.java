import java.util.Arrays;

public class MyHashMap<K, V> implements InterfaceMyHashMap<K, V> {
    private static final int CAPASITY = 16;
    private Entry<K, V>[] bukets;
    private int size;

    public MyHashMap() {
        this(CAPASITY);
    }

    public MyHashMap(int initCapacity) {
        this.bukets = new Entry[initCapacity];
        this.size = 0;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    @Override
    public void put(K key, V value) {
        int hash = key.hashCode();
        int buketNumber = Math.abs(hash % bukets.length);
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (bukets[buketNumber] == null) {
            bukets[buketNumber] = newEntry;
        } else {
            Entry<K, V> currentEntry = bukets[buketNumber];
            while (currentEntry.next != null) {
                if (currentEntry.key.equals(key)) {
                    currentEntry.value = value;
                    return;
                }
                currentEntry = currentEntry.next;
            }
            currentEntry.next = newEntry;
        }
        size++;
    }

    @Override
    public void remove(K key) {
        int hash = key.hashCode();
        int buketNumber = Math.abs(hash % bukets.length);
        Entry<K, V> currentEntry = bukets[buketNumber];
        Entry<K, V> previousEntry = null;
        while (currentEntry != null) {
            if (currentEntry.key.equals(key)) {
                if (previousEntry == null) {
                    bukets[buketNumber] = currentEntry.next;
                } else {
                    previousEntry.next = currentEntry.next;
                }
                size--;
                return;
            }
            previousEntry = currentEntry;
            currentEntry = currentEntry.next;
        }
    }

    @Override
    public void clear() {
        Arrays.fill(bukets, null);
        size = 0;
    }

    @Override
    public int size() {
        System.out.println("Розмір колекції: " + size);
        return size;
    }

    @Override
    public V get(K key) {
        int hash = key.hashCode();
        int buketNumber = Math.abs(hash % bukets.length);
        Entry<K, V> currentEntry = bukets[buketNumber];
        while (currentEntry != null) {
            if (currentEntry.key.equals(key)) {
                System.out.println("Ключ \"" + key + "\" має значення: " + currentEntry.value);
                return currentEntry.value;
            }
            currentEntry = currentEntry.next;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\nMyHashMap колекція: [\n");
        for (Entry<K, V> current : bukets) {
            while (current != null) {
                result.append(current.key).append("=").append(current.value);
                if (current.next != null) {
                    result.append(" -> ");
                } else {
                    result.append(";\n");
                }
                current = current.next;
            }
        }
        result.deleteCharAt(result.length()-1).append(']').append(" Розмір колекції: ").append(size);
        return result.toString();
    }
}
