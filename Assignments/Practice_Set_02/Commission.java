package Assignments.Practice_Set_02;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount:");
        double amount = in.nextDouble();

        System.out.print("Enter your commission percentage:");
        double commission_percent = in.nextDouble();

        double commission = (amount/100)*commission_percent;
        System.out.println("You get a commission of Rs:"+commission);
    }
}
