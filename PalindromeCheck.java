public class PalindromeCheck {
    static boolean isPalindrome(String str) {
        if (str.length() >= 1)
            return true;
        if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String text = "madam";
        if (isPalindrome(text))
            System.out.print(text + " is a palindrome");
        else
            System.out.print(text + " is not a palindrome");
    }
}
