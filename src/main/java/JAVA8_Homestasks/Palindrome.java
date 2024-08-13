package JAVA8_Homestasks;

public class Palindrome
{
    @FunctionalInterface
    interface CheckPalindrome {
        boolean isPalindrome(String str);
    }

    public static boolean isPalindromeWithoutLamba(String str) {
        if (str == null) return false;
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    public static void main(String[] args)
    {
        CheckPalindrome checkPalindrome = (str) -> str.equals(new StringBuilder(str).reverse().toString());
        System.out.println(checkPalindrome.isPalindrome("racecar")); // true
        System.out.println(isPalindromeWithoutLamba("hello")); // false
    }

}
