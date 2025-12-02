import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> input = Day01.loadInput("day01Input.txt");
        
        // part one 
        int zeroCount = Day01.password(input); 
        System.out.println("password: "+zeroCount);

    }
}