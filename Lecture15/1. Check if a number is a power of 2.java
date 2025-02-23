package Lecture15;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(n + " is power of 2: " + isPowerOfTwo(n));
    }
}
