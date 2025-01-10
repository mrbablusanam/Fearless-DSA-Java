package Assignments.Practice_Set_01;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input form the user
public class Question_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to Even or Odd:");
        int num = in.nextInt();
        int check = num%2;
        if(check==0){
            System.out.println("It is a Even Number.");
        }
        else{
            System.out.println("It is a Odd Number.");
        }
    }
}
