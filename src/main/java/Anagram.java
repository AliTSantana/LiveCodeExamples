import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main (String[] args){
        System.out.println(isAnagram("heart", "earth"));
        System.out.println(isAnagram("yesterday", "today"));
    }

    private static boolean isAnagram(String word1, String word2) {
        if (word1 == null || word2 == null) return false;
        if (word1.length() != word2.length()) return false;

        Map<Character, Integer> count = new HashMap<>();

        for (char c : word1.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            if (!count.containsKey(c)) return false;
            count.put(c, count.get(c) - 1);
            if (count.get(c) == 0) count.remove(c);
        }

        return count.isEmpty();
    }
}
