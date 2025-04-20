package Assignment.Pseudocode;

import java.util.Scanner;

public class Lcmgcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter a value of b :  ");
        int b = sc.nextInt();
         
        while(b != 0){
            int temp = b ;
            b = a%b ;
            a = temp;
        }
        System.out.println("GCD value = " + a);

        int LCM = (a*b)/a;
        System.out.println("LCM value = " + LCM);


    }
    
}
