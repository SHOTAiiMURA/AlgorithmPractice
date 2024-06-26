public class Palindrome {
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        if(sb.toString().equals(str)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String word1 = "racecar";
        String word2 = "hello";
        System.out.println(word1 + " is a palindrome: " + isPalindrome(word1)); // Output: racecar is a palindrome: true
        System.out.println(word2 + " is a palindrome: " + isPalindrome(word2)); // Output: hello is a palindrome: false
    }
}
