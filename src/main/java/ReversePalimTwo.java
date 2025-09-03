import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReversePalimTwo {
    public static void main(String[] args){
        System.out.println(reverse("To Reverse"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
        System.out.println(isPalindrome("Ana")); // true
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // [0, 1]
    }

    private static String reverse(String text){
        if (text == null) return null;
        char[] toReverse = text.toCharArray();
        int initArray = 0, finalArray = text.length() - 1;
        while (initArray < finalArray){
            char temporalChar = text.charAt(initArray);
            toReverse[initArray] = toReverse[finalArray];
            toReverse[finalArray] = temporalChar;
            initArray++;
            finalArray--;
        }
        return new String(toReverse);
     }

     private static boolean isPalindrome(String text){
        if (text == null) return false;
        int initArray = 0, finalArray = text.length() - 1;
        while (initArray < finalArray){
            while(initArray < finalArray && !Character.isLetterOrDigit(text.charAt(initArray))) initArray++;
            while(initArray < finalArray && !Character.isLetterOrDigit(text.charAt(finalArray))) finalArray--;

            if (Character.toLowerCase(text.charAt(initArray)) != Character.toLowerCase(text.charAt(finalArray)))
                return false;

            initArray++;
            finalArray--;
        }
        return true;
     }

     private static int[] twoSum(int[] numbers, int target){
        Map<Integer, Integer> complementMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            int complement = target - numbers[i];
            if (complementMap.containsKey(complement)){
                return new int[]{complementMap.get(complement), i};
            }
            complementMap.put(numbers[i],i);
         }
        return new int[]{};
     }
}
