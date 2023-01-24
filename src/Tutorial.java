// File: src/ Main.java

import java.util.Scanner;

public class Tutorial {
    public static void main(String[] args) {
        System.out.print("Input your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18) {
            System.out.print("What is your fave food: ");
            String food = sc.nextLine();

            if (food.equals("Pizza")) {
                System.out.println("Pizza is the best!");
            }
            else {
                System.out.println("You should have picked Pizza!");
            }
        }
        else if (age >= 13) {
            System.out.println("You are a teenager.");
        }
        else {
            System.out.println("You are a child.");
        }
    }
}
