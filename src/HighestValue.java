import java.util.Scanner;

public class HighestValue {
    public static void main(String[] args) {
        System.out.println("Please input a number:");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int num_1 = Integer.parseInt(s);

        System.out.println("Please input a second number:");
        Scanner scan_2 = new Scanner(System.in);
        String s_2 = scan_2.nextLine();
        int num_2 = Integer.parseInt(s_2);

        int highestVal = Math.max(num_1, num_2);

        System.out.println("The highest value is " + highestVal + ".");
    }
}
