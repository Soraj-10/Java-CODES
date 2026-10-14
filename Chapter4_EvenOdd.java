// Chapter4_EvenOdd.java
import java.util.Scanner;

public class Chapter4_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");


        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}