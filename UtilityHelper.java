import java.util.*;
import java.io.*;

public class UtilityHelper {
  private ArrayList<String> fileData;

  public UtilityHelper(String filePath){
    fileData = getRoverInput(filePath);
    fileData.remove(0);
  }

  public static ArrayList<String> getRoverInput(String filePath){
    ArrayList<String> roverInput = new ArrayList<String>();
    try {
      Scanner s = new Scanner(new File(filePath));
      while (s.hasNextLine()) {
        roverInput.add(s.nextLine());
      }
      s.close();
    } catch (Exception e) {
      System.out.println("Something is wrong with the rover instructions. File path is mars_rover_input.txt");
    }
    return roverInput;
  }

  public MarsRover createMarsRover(int x, int y){
    return new MarsRover(getStartingLocation(x), getInstructions(y));
  }

  public ArrayList<String> getStartingLocation(int x) {
    String coordinates = fileData.get(x);
    String[] grid = coordinates.split(" ");
    ArrayList<String> startingLocation = new ArrayList<String>();

    for (int i= 0; i < 3; i++) {
      startingLocation.add(grid[i]);
    }
    return startingLocation;
  }

  public ArrayList<String> getInstructions(int y) {
    String instructions = fileData.get(y);
    String[] input = instructions.split("");

    ArrayList<String> roverInstructions = new ArrayList<String>();
    for (int i= 0; i < input.length; i++) {
      roverInstructions.add(input[i]);
    }
    // Removes an empty value
    roverInstructions.remove(0);
    return roverInstructions;
  }
}
