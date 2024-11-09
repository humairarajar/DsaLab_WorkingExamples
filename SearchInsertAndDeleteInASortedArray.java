import java.util.Arrays;
import java.util.Scanner;

public class SortedArrayOperations {
    public static void main(String[] args) {
        // Initialize a sorted array
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Original Array: " + Arrays.toString(array));
        
        // Search Operation
        System.out.print("Enter element to search: ");
        int searchElement = scanner.nextInt();
        int searchIndex = binarySearch(array, searchElement);
        if (searchIndex != -1) {
            System.out.println("Element " + searchElement + " found at index: " + searchIndex);
        } else {
            System.out.println("Element " + searchElement + " not found.");
        }
        
        // Insert Operation
        System.out.print("Enter element to insert: ");
        int insertElement = scanner.nextInt();
        array = insertInSortedArray(array, insertElement);
        System.out.println("Array after Insertion: " + Arrays.toString(array));
        
        // Delete Operation
        System.out.print("Enter element to delete: ");
        int deleteElement = scanner.nextInt();
        array = deleteFromArray(array, deleteElement);
        System.out.println("Array after Deletion: " + Arrays.toString(array));
        
        scanner.close();
    }

    // Method for Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Element not found
    }

    // Method to Insert an Element in a Sorted Array
    public static int[] insertInSortedArray(int[] arr, int element) {
        int[] newArray = Arrays.copyOf(arr, arr.length + 1);
        int i = arr.length - 1;
        while (i >= 0 && arr[i] > element) {
            newArray[i + 1] = arr[i];
            i--;
        }
        newArray[i + 1] = element;
        return newArray;
    }

    // Method to Delete an Element from a Sorted Array
    public static int[] deleteFromArray(int[] arr, int element) {
        int index = binarySearch(arr, element);
        if (index == -1) {
            System.out.println("Element " + element + " not found. No deletion performed.");
            return arr; // Return original array if element not found
        }
        int[] newArray = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) newArray[j++] = arr[i];
        }
        return newArray;
    }
}
