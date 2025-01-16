package Assignments.Practice_Set_02;

import java.util.Scanner;

public class Kunal_EvenDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        System.out.print("Enter the Month name:");
        String month = in.nextLine();

        System.out.print("Enter the days in "+month+":");
        int days = in.nextInt();
        if(days==28 || days==29 || days==30 || days==31) {
            for (int i = 1; i <= days; i++) {
                if (i % 2 == 0) {
                    int count = day++;
                }
            }
            System.out.println("Kunal can go out for:" + day + " days");
        }
        else {
            System.out.println("Invalid Days");
        }
    }
}
