package Lecture8;

import java.util.Scanner;

public class AverageCalculator {
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        System.out.println("Average: " + average(x, y, z));
        sc.close();
    }
}
