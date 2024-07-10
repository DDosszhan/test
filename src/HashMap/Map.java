package HashMap;

public interface Map<K, V> {
    void put(K key, V value);
    V get(K key);
    void remove(K key);
    boolean containsKey(K key);
    int size();
    void clear();

    interface Entry<K, V> {
        K getKey();
        V getValue();
        void setValue(V value);
    }
}
