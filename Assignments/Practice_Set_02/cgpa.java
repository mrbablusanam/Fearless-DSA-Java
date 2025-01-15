package Assignments.Practice_Set_02;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Subject1 Marks:");
        int sub1 = in.nextInt();
        System.out.print("Enter Subject2 Marks:");
        int sub2 = in.nextInt();
        System.out.print("Enter Subject3 Marks:");
        int sub3 = in.nextInt();
        System.out.print("Enter Subject4 Marks:");
        int sub4 = in.nextInt();
        System.out.print("Enter Subject5 Marks:");
        int sub5 = in.nextInt();

        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        int percent = sum/5;
        float cgpa = (float) (percent/9.5);
        System.out.println("You got:"+percent+"%");
        System.out.println("CGPA:"+cgpa);
    }
}
