package Assignments.Practice_Set_01;

import java.util.Scanner;
//To find out whether the given String is palindrome or not.
public class Question_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word to check it is a palindrome or not");
        String word = in.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();
        if(word.equals(reversed)){
            System.out.println(word+" Given String is a palindrome");
        }
        else {
            System.out.println(word+" Given String is not a palindrome");
        }

    }
}
