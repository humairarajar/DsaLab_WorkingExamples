import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        reverseArray(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
