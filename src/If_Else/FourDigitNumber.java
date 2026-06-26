package If_Else;

import java.util.Scanner;

public class FourDigitNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a number :");
        int n = sc.nextInt();

//        if (n>999 && n<10000) System.out.println("Is a Four Digit Number");
//        else System.out.println(" Is Not a four didgit number");

        if(n%5== 0 || n%3==0)
            System.out.println(" Divisible by 5 or 3");
        else
            System.out.println("Not Divisioble by 5 or 3");



    }
}
