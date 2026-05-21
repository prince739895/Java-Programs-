package Basics_java;

import java.util.Scanner;

public class AreaOfSquar {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" enter the raduis");
        int x = sc.nextInt();
        int area= x * x;
        System.out.println(" Radius is =");
        System.out.println(area);
    }
}
