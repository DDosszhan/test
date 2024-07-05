package LinkedList;


public class LinkedList<T>  {
    private Node<T> head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean remove(T data){
        if(head==null){
            return false;
        }
        if(head.data.equals(data)){
            head = head.next;
            size--;
            return true;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        if(current.next != null){
            current.next = current.next.next;
            size--;
            return true;
        }

        return false;

    }

    public T get(int index){
        if(index<0 || index >size){
            return null;
        }

        Node<T> current = head;
        for(int i =0; i<index; i++){
            current = current.next;
        }
        return current.data;
    }

    public int size(){
        return size;
    }
    public void printList(){
        if(head == null){
            System.out.print("List is empty");
        }
        Node<T> current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}
