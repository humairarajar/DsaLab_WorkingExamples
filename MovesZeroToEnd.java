import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12};
        moveZeroes(array);
        System.out.println("Array after moving zeroes: " + Arrays.toString(array));
    }

    public static void moveZeroes(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) arr[index++] = num;
        }
        while (index < arr.length) arr[index++] = 0;
    }
}
