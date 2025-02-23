package Lecture13;
/* 2. Replace 'e' with 'i' in a string */

import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                result.append('i');
            } else {
                result.append(str.charAt(i));
            }
        }

        System.out.println(result);
        sc.close();
    }
}