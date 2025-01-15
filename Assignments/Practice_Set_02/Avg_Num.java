package Assignments.Practice_Set_02;

import java.util.Scanner;

public class Avg_Num {
    public static void main(String[] args) {
        float a = 0;
        float b = 1;
        float avg = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers to find their average:");
        float n = in.nextInt();
        for(float i = 2; i<=n; i++){
            float temp = b;
            b = b + a;
            a = temp;
            System.out.println(b);
        }
        avg  = b/n;
        System.out.println(b);
        System.out.println("The average of nth number is:"+avg);
    }
}
