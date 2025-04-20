package Assignment.Pseudocode;

import java.util.Scanner;

public class InputX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a number (or 'x' to stop): ");
            String input = sc.next();

            if (input.equals("x")) {
                break;
            }

            int num = Integer.parseInt(input);  // convert string to number
            sum = sum + num;  // add to sum
        }

        System.out.println("Total Sum = " + sum);
    }
}
