package tasks;

//Task-3:Demonstrate interning, immutability, equals vs ==, and manipulate arrays of strings.

import java.util.Scanner;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Interning and == vs equals()
        String s1 = "Hello";
        String s2 = "Hello";              // Interned
        String s3 = new String("Hello");  // New object, not interned

        System.out.println("Comparing Strings:");
        System.out.println("s1 == s2: " + (s1 == s2));             // true (same reference due to interning)
        System.out.println("s1 == s3: " + (s1 == s3));             // false (different objects)
        System.out.println("s1.equals(s3): " + s1.equals(s3));     // true (same value)

        // Demonstrating immutability
        String original = "Java";
        String modified = original.concat(" Programming");

        System.out.println("\nString Immutability:");
        System.out.println("Original String: " + original);         // Java
        System.out.println("Modified String: " + modified);         // Java Programming

        // Array of Strings
        System.out.print("\nEnter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] words = new String[n];

        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        // Display original array
        System.out.println("\nOriginal array:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        // Sort array
        Arrays.sort(words);
        System.out.println("\n\nSorted array:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        // Reverse array
        System.out.println("\n\nReversed array:");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        // Concatenate all strings
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }
        System.out.println("\n\nConcatenated String: " + sb.toString().trim());

        sc.close();
    }
}