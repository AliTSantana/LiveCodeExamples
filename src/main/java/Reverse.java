public class Reverse {
    public static void main(String[] args){
        String word = "Reverse";
        System.out.println(reverse(word));
    }

    private static String reverse(String word){
        if(word == null) return null;
        char[] toReverse = word.toCharArray();
        int initArray = 0, finalArray = word.length() - 1;
        while (initArray < finalArray){
            char temporalChar = toReverse[initArray];
            toReverse[initArray] = toReverse[finalArray];
            toReverse[finalArray] = temporalChar;
            initArray++; finalArray--;
        }
        return new String(toReverse);
    }
}
