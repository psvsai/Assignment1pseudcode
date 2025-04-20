package Assignment.Pseudocode;

import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of a : ");
        int a = sc.nextInt();
        System.out.println("Ente a value of b : ");
        int b = sc.nextInt();

        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        System.out.println("GCD of two value is : " + a);

        int lcm = (a*b)/a;
        System.out.println("Lcm is ");
  
   }
}

