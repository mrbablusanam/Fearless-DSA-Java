package Assignments.Practice_Set_02;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year to check whether it leap year or not:");
        int year = in.nextInt();

        if(year%4==0){
            System.out.println(year+" is a leap year.");
        }
        else {
            System.out.println(year+" is not a leap year.");
        }
    }
}
