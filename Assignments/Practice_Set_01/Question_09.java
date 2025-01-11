package Assignments.Practice_Set_01;

import java.util.Scanner;

//Counting Occurrence: count repeated numbers how many times it occur
public class Question_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find repeated number:");
        long n = in.nextInt();
        System.out.print("Enter the number to match:");
        int f = in.nextInt();
        int count = 0;
        while(n>0){
            long rem = n % 10;
            if(rem==f){
                count++;
            }
            n = n / 10;
        }
        System.out.print(f+" is repeated:"+count+" times.");
    }
}
