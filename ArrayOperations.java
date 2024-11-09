import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        // Declaration and Initialization
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(array));

        // Adding an element (not directly possible with primitive arrays, need to use a new array)
        array = addElement(array, 60);
        System.out.println("After Adding 60: " + Arrays.toString(array));

        // Editing an element
        array[2] = 35; // Changing the value at index 2
        System.out.println("After Editing: " + Arrays.toString(array));

        // Deleting an element by index
        array = deleteElement(array, 1); // Deleting element at index 1
        System.out.println("After Deleting at index 1: " + Arrays.toString(array));
    }

    // Method to add an element to the array
    public static int[] addElement(int[] arr, int element) {
        int[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[arr.length] = element;
        return newArray;
    }

    // Method to delete an element at a specified index
    public static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) return arr;
        int[] newArray = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) newArray[j++] = arr[i];
        }
        return newArray;
    }
}
