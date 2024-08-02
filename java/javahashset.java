import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
     {
         Scanner scanner = new Scanner(System.in);

        // Read the number of pairs
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create a HashSet to store unique pairs
        Set<String> uniquePairs = new HashSet<>();

        // Process each pair
        for (int i = 0; i < n; i++) {
            // Read the pair of strings
            String first = scanner.next();
            String second = scanner.next();

            // Concatenate the pair and add it to the HashSet
            String pair = "(" + first + "," + second + ")";
            uniquePairs.add(pair);

            // Print the number of unique pairs after each input
            System.out.println(uniquePairs.size());
        }

        // Close the scanner
        scanner.close();
    }
}
    

