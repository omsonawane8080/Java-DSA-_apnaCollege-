package Lecture15;

public class BinaryConversion {
    public static String decimalToBinary(int n) {
        return Integer.toBinaryString(n); // Built-in method
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        int decimal = 10;
        String binary = "1010";

        System.out.println("Decimal to Binary: " + decimalToBinary(decimal));
        System.out.println("Binary to Decimal: " + binaryToDecimal(binary));
    }
}
