import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day01 {

    public static ArrayList<String> loadInput(String filePath) {
        filePath = "../../inputs/" + filePath;
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

    public static int password(ArrayList<String> list) {
        int curr = 50;
        int zeroCount = 0;

        for (int i = 0; i < list.size(); i++) {
            int rotation = Integer.parseInt(list.get(i).substring(1));
            int direction; 
            if (list.get(i).substring(0, 1).contains("R"))
                direction = 0;
            else
                direction = 1; 

            int[] output = dialer(direction, rotation, curr, false);

            curr = output[0];
            zeroCount += output[1];
        }

        return zeroCount;
    }

    private static int[] dialer(int direction, int rotations, int dial, boolean modified) {
        // right = 0, left = 1
        // dial = [0], zeroCount = [1]

        int newDial = dial;
        int zeroCount = 0;
        for (int i = 0; i < rotations; i++) {
            if (direction == 0) 
                newDial++;
            else 
                newDial--;

            if (newDial == 100) 
                newDial = 0;
            else if (newDial == -1) 
                newDial = 99;

            if (modified && newDial == 0) 
                zeroCount++;
        }

        if (newDial == 0 && !modified) 
            zeroCount++;

        return new int[]{newDial, zeroCount};
    }
}