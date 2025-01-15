package Assignments.Practice_Set_02;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the product:");
        int price = in.nextInt();
        System.out.print("Enter the discount % on the product:");
        int disc = in.nextInt();
        int calculate = (price/100)*disc;
        int rate = price - calculate;
        System.out.println("The final price of the product is:"+rate);
    }
}
