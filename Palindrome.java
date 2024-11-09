public class Palindrome {
    public static void main(String[] args) {
        String str = "radar";
        System.out.println("Is palindrome? " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
}
