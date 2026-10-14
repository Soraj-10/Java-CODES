// Chapter15_File.java
import java.io.*;

public class Chapter15_File {
    public static void main(String[] args) throws Exception {
        // Write
        PrintWriter out = new PrintWriter("test.txt");
        out.println("I completed Chapter 15");
        out.close();

        // Read
        BufferedReader in = new BufferedReader(new FileReader("test.txt"));
        System.out.println(in.readLine());
        in.close();
    }
}