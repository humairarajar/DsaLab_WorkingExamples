public class FindMin {
    public static void main(String[] args) {
        int[] array = {10, 20, 5, 40, 50};
        System.out.println("Minimum Value: " + findMin(array));
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
}
