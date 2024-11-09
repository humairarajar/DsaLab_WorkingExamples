public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
        System.out.println("Missing Number: " + findMissingNumber(array));
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) sum += num;
        return totalSum - sum;
    }
}
