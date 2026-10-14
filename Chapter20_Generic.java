// Chapter20_Generic.java
public class Chapter20_Generic {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4 };
        String[] strArray = { "A", "B", "C" };

        printArray(intArray);
        printArray(strArray);
    }
}