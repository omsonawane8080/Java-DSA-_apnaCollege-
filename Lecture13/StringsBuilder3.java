package Lecture13;

/* 3. Extract username from an email */
import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        StringBuilder userName = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            }
            userName.append(email.charAt(i));
        }

        System.out.println(userName);
        sc.close();
    }
}