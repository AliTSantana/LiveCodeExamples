public class StringContainVowels {
    public static void main(String[] args){
        System.out.println(hasVowels("Has Vowels"));
        System.out.println(hasVowels("Hs nt Vws"));

    }

    private static boolean hasVowels(String text){
        String vowels = "aeiouAEIOU";

        for (char charToCheck : text.toCharArray()){
            if (vowels.indexOf(charToCheck) != -1)
                return true;
        }
        return false;
    }
}
