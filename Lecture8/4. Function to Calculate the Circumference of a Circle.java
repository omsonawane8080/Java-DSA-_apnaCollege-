package Lecture8;
import java.util.Scanner;

public class CircleCircumference {
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Circumference: " + circumference(r));
        sc.close();
    }
}
