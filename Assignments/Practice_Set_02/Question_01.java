package Assignments.Practice_Set_02;

import java.util.Scanner;
//Area of Circle Java Program
public class Question_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius:");
        int r = in.nextInt();
        float Area = (float) (Math.PI*r*r);
        System.out.println("The Area of a Circle of radius "+r+" is:"+Area);
    }
}
