package Assignment.Pseudocode;

import java.util.Scanner;

public class Multipseudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Multiplication of  ");
        int a = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println( a + " * " + " " + i  + " = "    +    i*a);
        }
    }
    
}
