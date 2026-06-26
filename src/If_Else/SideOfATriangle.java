package If_Else;

import java.util.Scanner;

public class SideOfATriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st num: ");
        int a = sc.nextInt();

        System.out.println("Enter 2st num: ");
        int  b = sc.nextInt();

        System.out.println("Enter 3st num: ");
        int c = sc.nextInt();
        if (a+b>c && b+c>a && c+a>b)
            System.out.println(" Valide");
        else
            System.out.println(" Invalid");
    }
}
