package HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedHashSet<T> implements Iterable<T> {
    private Node<T>[] buckets;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    // Node class for LinkedHashSet
    private static class Node<T> {
        T key;
        Node<T> next;
        Node<T> prev; // For doubly linked list
        Node<T> nextInOrder; // For maintaining insertion order

        Node(T key) {
            this.key = key;
            this.next = null;
            this.prev = null;
            this.nextInOrder = null;
        }
    }

    private Node<T> head; // Head of the doubly linked list
    private Node<T> tail; // Tail of the doubly linked list

    // Constructor
    @SuppressWarnings("unchecked")
    public LinkedHashSet() {
        this.buckets = (Node<T>[]) new Node[DEFAULT_CAPACITY];
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    // Hashing
    private int hash(T element) {
        return element == null ? 0 : Math.abs(element.hashCode() % buckets.length);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T element) {
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
        head = null;
        tail = null;
        for (Node<T> bucket : oldBuckets) {
            Node<T> current = bucket;
            while (current != null) {
                add(current.key);
                current = current.next;
            }
        }
    }

    public boolean add(T element) {
        if (contains(element)) {
            return false;
        }
        if (size >= LOAD_FACTOR * buckets.length) {
            resize();
        }
        int index = hash(element);
        Node<T> newNode = new Node<>(element);

        // Insert into hash table
        newNode.next = buckets[index];
        buckets[index] = newNode;

        // Insert into linked list
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.nextInOrder = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
        return true;
    }

    public boolean remove(T element) {
        int index = hash(element);
        Node<T> current = buckets[index];
        Node<T> prev = null;
        while (current != null) {
            if (current.key.equals(element)) {
                // Remove from hash table
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }

                // Remove from linked list
                if (current.prev != null) {
                    current.prev.nextInOrder = current.nextInOrder;
                } else {
                    head = current.nextInOrder;
                }
                if (current.nextInOrder != null) {
                    current.nextInOrder.prev = current.prev;
                } else {
                    tail = current.prev;
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
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.key + " ");
            current = current.nextInOrder;
        }
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

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
                current = current.nextInOrder;
                return element;
            }
        };
    }
}
