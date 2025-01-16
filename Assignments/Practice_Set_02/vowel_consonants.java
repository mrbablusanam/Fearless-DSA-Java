package Assignments.Practice_Set_02;

public class vowel_consonants {
    public static void main(String[] args) {
        char i;
        for( i = 'a'; i<='z';i++) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                System.out.print(i + " ");
            }
        }
    }
}
