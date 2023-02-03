import java.util.HashSet;
import java.util.Set;

public class ExampleSet {
    public static void main(String[] args) {
        Set<Integer> tree = new HashSet<Integer>();

        tree.add(5);
        tree.add(6);
        tree.add(5);
        tree.add(9);
        tree.add(-10);

        System.out.println(tree);
    }

}
