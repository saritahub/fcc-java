import java.util.Set;

public class TreeSet<I extends Number> {
    public static void main(String[] args) {
        Set<Integer> tree = new java.util.TreeSet<Integer>();

        tree.add(5);
        tree.add(6);
        tree.add(5);
        tree.add(9);
        tree.add(-10);
        tree.remove(9);

        System.out.println(tree);

        boolean doesExist = tree.contains(5);
        System.out.print(doesExist);
    }

}
