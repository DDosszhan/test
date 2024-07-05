package HashSet;

public class Test {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<Integer>();
        if(hashSet.isEmpty()) {
            System.out.println("List is empty");
        }
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println(hashSet.size());
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(99);
        System.out.println(hashSet.contains(3));
        hashSet.remove(3);
        System.out.println(hashSet.contains(3));
        hashSet.print();

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.print();
    }
}
