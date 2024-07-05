package ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.print();
        list.size();
        list.remove("c");
        list.print();
        list.size();
    }
}
