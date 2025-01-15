package Assignments.Practice_Set_02;

import java.util.Scanner;

public class Batting_Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total run of Batsman:");
        float run = in.nextFloat();
        System.out.print("Now enter the total dismissed:");
        float out = in.nextFloat();
        float avg = (run/out);
        System.out.println("The average of Batsman is:"+avg);
    }
}
