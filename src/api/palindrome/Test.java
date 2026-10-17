package api.palindrome;

public class Test {
    public static void main(String[] args) {
        String str1 = "上海自来水来自海上";
        String str2 = "短剑";
        String str3 = "level";
        String str4 = "天连碧水碧连天";
        System.out.println(Palindrome.isPalindrome(str1));
        System.out.println(Palindrome.isPalindrome(str2));
        System.out.println(Palindrome.isPalindrome(str3));
        System.out.println(Palindrome.isPalindrome(str4));
    }
}
