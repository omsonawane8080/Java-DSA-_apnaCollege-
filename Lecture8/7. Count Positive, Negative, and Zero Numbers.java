package Lecture8;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, zero = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num > 0) pos++;
            else if (num < 0) neg++;
            else zero++;

            System.out.print("Do you want to enter more numbers? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive: " + pos + ", Negative: " + neg + ", Zeros: " + zero);
        sc.close();
    }
}
