package Assignments.Practice_Set_02;

import java.util.Scanner;

public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the unit:");
        float unit = in.nextFloat();
        float bill = unit * 4.30f;
        System.out.println("Your Electiricity Bill is:"+bill);
    }
}
