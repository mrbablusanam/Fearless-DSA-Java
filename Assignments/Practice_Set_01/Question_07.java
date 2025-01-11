package Assignments.Practice_Set_01;

import java.util.Scanner;

//Fibonacci Series
public class Question_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to perform series:");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while( count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.println(b);
        }
        //If you print only the last number then print b outside the loop
    }
}
