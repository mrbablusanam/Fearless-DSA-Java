package Assignments.Practice_Set_01;

import java.util.Scanner;

//Take three numbers and print the largest number among them.
public class Question_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three number to find which one is large:");
        int num1 = in.nextInt();
        int num2= in.nextInt();
        int num3 = in.nextInt();
        if(num1>num2 && num1>num3){
            System.out.print(num1+" is the largest number.");
        }
        else if(num2>num1 && num2>num3){
            System.out.print(num2+" is the largest number.");
        }
        else {
            System.out.print(num3+" is the largest number.");
        }
    }
}
