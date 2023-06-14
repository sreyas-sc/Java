import java.util.Scanner;

public class BubbleSortStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Read the string array elements
        System.out.println("Enter the string array elements:");
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.next();
        }
        
        // Sort the array using bubble sort
        bubbleSort(array);
        
        // Print the sorted array
        System.out.println("Sorted array:");
        for (String element : array) {
            System.out.print(element + " ");
        }
    }
    
    public static void bubbleSort(String[] array) {
        int n = array.length;
        
        // Perform n-1 iterations
        for (int i = 0; i < n - 1; i++) {
            // Perform one iteration of bubble sort
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap if necessary
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

