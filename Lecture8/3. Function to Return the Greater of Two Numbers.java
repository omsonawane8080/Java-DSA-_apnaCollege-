package Lecture8;
import java.util.Scanner;

public class GreaterNumber {
    public static int greater(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.println("Greater number: " + greater(x, y));
        sc.close();
    }
}
