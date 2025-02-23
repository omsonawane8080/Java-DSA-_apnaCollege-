package Lecture7;

public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i * i <= n; i++) { // Check divisibility up to sqrt(n)
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 17; // Example number
        System.out.println(num + " is prime: " + isPrime(num));
    }
}
