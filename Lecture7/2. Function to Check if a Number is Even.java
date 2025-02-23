package Lecture7;

public class EvenCheck {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 8; // Example number
        System.out.println(num + " is even: " + isEven(num));
    }
}
