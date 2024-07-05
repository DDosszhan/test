package LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.printList();
        System.out.println("The size is "+ list.size());
        System.out.println("The element with index 1 is "+ list.get(1));
        list.remove("B");
        System.out.println("The size is "+ list.size());
        list.printList();
    }
}
