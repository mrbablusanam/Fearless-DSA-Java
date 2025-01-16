package Assignments.Practice_Set_02;

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal amount:");
        double p = in.nextDouble();

        System.out.print("Enter the rate:");
        double r = in.nextDouble();

        System.out.print("Enter the time:");
        double t = in.nextDouble();

        double compound =  ((r/100)+1)*((r/100)+1);
        double total = compound*p;

        double interest = total - p ;
        System.out.println("The total interest Rs:"+interest );
    }
}
