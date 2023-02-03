import java.util.ArrayList;

public class ArrayListExample<I extends Number> {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(21);
        arr.add(242);
        arr.set(1, 1342);

        int second = arr.get(1);

        String range = arr.subList(0, 3).toString();
        System.out.print(range);
    }

}
