import java.util.Arrays;

public class ResizeArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        array = resizeArray(array, 3); // Resize to 3 elements
        System.out.println("Resized Array: " + Arrays.toString(array));
    }

    public static int[] resizeArray(int[] arr, int newSize) {
        return Arrays.copyOf(arr, newSize);
    }
}
