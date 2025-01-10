package Assignments.Practice_Set_01;

import java.util.Objects;
import java.util.Scanner;

//Take name as a input and print a greeting message for that particular name.
public class Question_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Beautiful Name:");
        String name = in.nextLine();
        System.out.print("Enter Your Beautiful Religion:");
        String religion = in.nextLine();

        switch (religion) {
            case "Muslim", "muslim" -> System.out.println("Asslamualaikum " + name);
            case "Hindu", "hindu" -> System.out.println("Radhe-Radhe " + name);
            case "Sikh", "sikh" -> System.out.println("SSat-Sri-Akal " + name);
            case null, default -> System.out.println("GoodMorning " + name);
        }

    }
}
