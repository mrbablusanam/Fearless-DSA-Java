package Assignments.Practice_Set_02;

import java.util.Scanner;

public class Armstrong_3digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 153;
        int sum = 0;

       while(num>0){

            int rem = num % 10;
            int cube = rem * rem * rem;
             sum += cube;
            num = num/10;

        }
        System.out.println(sum);
    }
}
