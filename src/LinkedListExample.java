import java.util.LinkedList;

public class LinkedListExample<I extends Number> {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();

        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(21);
        linkedlist.add(242);
        linkedlist.set(1, 1342);

        int second = linkedlist.get(1);

        String range = linkedlist.subList(0, 3).toString();
        System.out.print(range);
    }

}
