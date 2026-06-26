package If_Else;

import java.util.Scanner;

public class Profit_Loss {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter cost price :");
        int cp = sc.nextInt();
        System.out.println(" Enter selling price :");
        int sp = sc.nextInt();
        if (sp>cp) System.out.println("Profit "+(sp-cp));
        if( cp>sp) System.out.println("Loss "+( cp-sp));
        if (sp==cp) System.out.println(" No Profit No Loss");
    }
}
