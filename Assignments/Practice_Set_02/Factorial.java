package Assignments.Practice_Set_02;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int temp = 1 ;
        int fact = 0 ;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no to find it's factorial:");
        int n = in.nextInt();
        for(int x = 1; x <= n; x++){
            fact = temp * x;
            temp = fact;
        }
        System.out.print("The factorial of "+n+" is:"+fact);
    }
}
