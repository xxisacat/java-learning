package api.palindrome;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        return s.toString().equals(new StringBuilder(s).reverse().toString());
    }
}

