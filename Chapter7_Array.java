// Chapter7_Array.java
public class Chapter7_Array {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for (int n : numbers) {
            sum += n;
        }
        System.out.println("Sum of array = " + sum);
    }
}