import java.util.HashSet;
import java.util.Set;

public class ExampleSet {
    public static void main(String[] args) {
        Set<Integer> hash = new HashSet<Integer>();

        hash.add(5);
        hash.add(6);
        hash.add(5);
        hash.add(9);
        hash.add(-10);
        hash.remove(9);

        System.out.println(hash);

        boolean doesExist = hash.contains(5);
        System.out.print(doesExist);
    }

}
