package Assignments.Practice_Set_02;

import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = in.nextInt();
        System.out.print("Now Enter the power:");
        int pwr = in.nextInt();
        int pow = (int) Math.pow(num,pwr);
        System.out.print("The answer is:"+pow);
    }
}
