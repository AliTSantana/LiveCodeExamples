public class FizzBuzz {
    public static void main(String[] args){
        printFizzBuzzNumber();
        printFizzBuzzNumberElegant();
    }

    private static void printFizzBuzzNumber(){
        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    private static void printFizzBuzzNumberElegant(){
        for(int i = 1; i <=
                100; i++){
            String output = "";
            if (i % 3 == 0) output += "Fizz";
            if (i % 5 == 0) output += "Buzz";
            System.out.println(output.isEmpty() ? i : output);
        }
    }
}
