
// Chapter2_BasicIO.java
import java.util.Scanner;

public class Chapter2_BasicIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Sum = " + (a + b));
        System.out.println("Product = " + (a * b));
        System.out.println("Is a greater than b? " + (a > b));
    }
}