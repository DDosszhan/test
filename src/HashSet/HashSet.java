package HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashSet<T> implements Iterable<T>{
    private Node<T>[] buckets;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;


    //Constructor
    @SuppressWarnings("unchecked")
    public HashSet(){
        this.buckets = (Node<T>[]) new Node[DEFAULT_CAPACITY];
        this.size = 0;
    }
    //For Hashing
    private int hash(T element){
        return element==null?0:Math.abs(element.hashCode() % buckets.length);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }



    public boolean contains(T element){
        int index = hash(element);
        Node<T> current = buckets[index];
        while (current != null) {
            if (current.key.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;


    }


    @SuppressWarnings("unchecked")
    private void resize() {
        Node<T>[] oldBuckets = buckets;
        buckets = (Node<T>[]) new Node[oldBuckets.length * 2];
        size = 0;
        for (Node<T> bucket : oldBuckets) {
            Node<T> current = bucket;
            while (current != null) {
                add(current.key);
                current = current.next;
            }
        }
    }


    public boolean add(T element){
        if (contains(element)){
            return false;
        }
        if(size>= LOAD_FACTOR * buckets.length){
            resize();
        }
        int index = hash(element);
        Node<T> newNode = new Node<>(element);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
        return true;
    }
    public boolean remove(T element){
        int index = hash(element);
        Node<T> current = buckets[index];
        Node<T> prev = null;
        while (current != null) {
            if(current.key.equals(element)){
                if(prev == null){
                    buckets[index] = current.next;
                } else{
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }
    public void print() {
        for (int i = 0; i < buckets.length; i++) {
            Node<T> current = buckets[i];
            while (current != null) {
                System.out.print(current.key + " ");
                current = current.next;
            }
        }
        System.out.println();
    }
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int bucketIndex = 0;
            private Node<T> current = getNextNode();

            private Node<T> getNextNode() {
                while (bucketIndex < buckets.length && buckets[bucketIndex] == null) {
                    bucketIndex++;
                }
                return bucketIndex < buckets.length ? buckets[bucketIndex] : null;
            }

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T element = current.key;
                current = current.next;
                if (current == null) {
                    bucketIndex++;
                    current = getNextNode();
                }
                return element;
            }
        };
    }

}
