package Lecture8;

import java.util.Scanner;

public class VotingEligibility {
    public static boolean isEligible(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Eligible to vote: " + isEligible(age));
        sc.close();
    }
}
