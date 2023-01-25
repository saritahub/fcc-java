import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,4,5};
        String[] names = new String[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] =  input;
        }

        for (String n:names) {
            System.out.println(n);
            if (n.equals("Ted")){
                break;
            }
           
        }
    }
}
