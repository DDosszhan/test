package HashMap;

import java.util.LinkedList;

public class HashMap<K, V> implements Map<K, V>{
    private class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size;
    private LinkedList<Entry<K, V>>[] map;
    private int count;

    @SuppressWarnings("unchecked")
    public HashMap(int size) {
        this.size = size;
        this.map = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            map[i] = new LinkedList<>();
        }
        this.count = 0;
    }

    private int getIndex(K key) {
        return key.hashCode() % size;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> entries = map[index];

        for (Entry<K, V> entry : entries) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        entries.add(new Entry<>(key, value));
        count++;
    }

    public V get(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> entries = map[index];

        for (Entry<K, V> entry : entries) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> entries = map[index];

        for (Entry<K, V> entry : entries) {
            if (entry.key.equals(key)) {
                entries.remove(entry);
                count--;
                return;
            }
        }
    }

    public boolean containsKey(K key) {
        int index = getIndex(key);
        LinkedList<Entry<K, V>> entries = map[index];

        for (Entry<K, V> entry : entries) {
            if (entry.key.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        return count;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            map[i].clear();
        }
        count = 0;
    }

}
