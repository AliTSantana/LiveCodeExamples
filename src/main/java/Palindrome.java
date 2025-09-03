public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
        System.out.println(isPalindrome("Ana")); // true
    }

    private static boolean isPalindrome(String text){
        if (text == null) return false;
        int initChar = 0, finalChar = text.length() - 1;
        while (initChar < finalChar){
            while (initChar < finalChar && !Character.isLetterOrDigit(text.charAt(initChar))) initChar++;
            while (initChar < finalChar && !Character.isLetterOrDigit(text.charAt(finalChar))) finalChar--;

            if(Character.toLowerCase(text.charAt(initChar)) != Character.toLowerCase(text.charAt(finalChar)))
                return false;

            initChar++;
            finalChar--;
        }
        return true;
    }
}
