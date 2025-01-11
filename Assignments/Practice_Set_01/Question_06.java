package Assignments.Practice_Set_01;

import java.util.Scanner;
//Input currency in rupees and convert it into USD.
public class Question_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rupees to convert into USD:");
        float rps = in.nextFloat();
        float USD = rps/83;
        System.out.println(rps+" Rupees in USD:"+USD);
    }
}