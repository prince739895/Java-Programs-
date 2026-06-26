package If_Else;

import java.util.Scanner;

public class IsInteger {
    static void main(String[] args) {

        System.out.println(" Enter a number :");
        Scanner sc =  new Scanner(System.in);
        double n = sc.nextDouble();
        int x = (int)n;
        if( n-x == 0) System.out.println(" Is an integer");
        else System.out.println(" Not an integer");
    }
}
