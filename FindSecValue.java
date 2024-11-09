import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] array = {10, 20, 5, 40, 50};
        System.out.println("Second Maximum Value: " + findSecondMax(array));
    }

    public static int findSecondMax(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                return arr[i];
            }
        }
        return -1; // If all elements are the same
    }
}
