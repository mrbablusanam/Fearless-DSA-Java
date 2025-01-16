package Assignments.Practice_Set_02;

import java.util.Scanner;

public class Future_Investment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the investment amount:");
        double amount = in.nextDouble();

        System.out.print("Enter the Annual interest rate:");
        double rate = in.nextDouble();

        System.out.print("Enter the years the money invested:");
        double years = in.nextDouble();

        double FV = (amount * Math.pow((1+ rate /100),years));
        System.out.println("The Investment grows to Rs:"+FV);
    }
}
