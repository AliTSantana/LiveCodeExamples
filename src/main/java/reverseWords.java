public class reverseWords {
    public static void main(String[] args){
        System.out.println(reverse("Hola mundo que tal"));
    }

    private static String reverse(String text){
        if (text == null || text.isEmpty()) throw new IllegalArgumentException("The text is empty");

        String[] textWords = text.trim().split("\\s+");
        StringBuilder textRevered = new StringBuilder();
        for (int i = textWords.length - 1; i >= 0; i--) {
            textRevered.append(textWords[i]);
            if (i != 0) textRevered.append(" ");
        }
        return textRevered.toString();
    }
}
