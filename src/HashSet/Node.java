package HashSet;

public class Node<T> {
    T key;
    Node<T> next;
    public Node(T key) {
        this.key = key;
        this.next = null;
    }
}
