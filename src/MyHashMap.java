public class MyHashMap<K, V> implements InterfaceMyHashMap<K, V> {
    private Entry<K, V>[] bukets;

    public MyHashMap() {
        this.bukets = new Entry[10];
    }

    @Override
    public void put(K key, V value) {
        int hash = key.hashCode();
        int buketNumber = hash % bukets.length;

        Entry<K, V> kvEntry = new Entry<>();
        kvEntry.setKey(key);
        kvEntry.setValue(value);

        if(bukets[buketNumber] == null) {
            bukets[buketNumber] = kvEntry;
        }  else {

        }
    }

    @Override
    public void remove(K key) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public V get(K key) {
        return null;
    }
}
