import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> input = Day01.loadInput("day01Input.txt");
        
        // part one 
        int zeroCount = Day01.passwordOne(input); 
        System.out.println("first password: "+zeroCount);

        // part two 
        zeroCount = Day01.passwordTwo(input);
        System.out.println("second password: "+zeroCount);
    }
}
