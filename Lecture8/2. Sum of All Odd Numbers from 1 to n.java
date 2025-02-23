package Lecture8;

import java.util.Scanner;

public class SumOfOdds {
    public static int sumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Sum of odd numbers: " + sumOdd(n));
        sc.close();
    }
}
