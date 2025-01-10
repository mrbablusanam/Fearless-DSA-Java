package Assignments.Practice_Set_01;

import java.util.Scanner;

//Write a program to find simple interest all inputs should be taken by user.
public class Question_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float prn , t, rt, interest;
        System.out.print("Enter Principal amount:");
        prn = in.nextFloat();
        System.out.print("Enter the Time:");
        t = in.nextFloat();
        System.out.print("Enter the Rate:");
        rt = in.nextFloat();
        interest = (prn*t*rt)/100;
        System.out.println("The interest of "+prn+" is: "+interest+"/-");
    }
}
