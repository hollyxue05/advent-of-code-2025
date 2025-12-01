import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day01 {

    public static ArrayList<String> loadInput(String filePath) {
        filePath = "../../inputs/day01Input.txt"; // + filePath;
        //System.out.println("filepath: " + filePath);
        ArrayList<String> returnStringArray = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                returnStringArray.add(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e);
        }

        return returnStringArray;
    }
}