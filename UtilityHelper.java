import java.util.*;
import java.io.*;

public class UtilityHelper {

  private ArrayList<String> startingLocation = new ArrayList<String>();
  private ArrayList<String> roverInstructions = new ArrayList<String>();
  private ArrayList<MarsRover> marsRovers = new ArrayList<MarsRover>();
  private ArrayList<String> directions;

  public UtilityHelper(String filePath){
    directions = getRoverInput(filePath);
    directions.remove(0);
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

  public void createMarsRovers(int x, int y){
    marsRovers.add(new MarsRover(getStartingLocation(x), getInstructions(y)));
  }

  public ArrayList<String> getStartingLocation(int x) {
    String coordinates = directions.get(x);
    String[] grid = coordinates.split(" ");

    for (int i= 0; i < 3; i++) {
      startingLocation.add(grid[i]);
    }
    return startingLocation;
  }

  public ArrayList<String> getInstructions(int y) {
    String instructions = directions.get(y);
    String[] input = instructions.split("");

    for (int i= 0; i < input.length; i++) {
      roverInstructions.add(input[i]);
    }
    roverInstructions.remove(0);
    return roverInstructions;
  }

  public ArrayList<MarsRover> getRovers() {
    return this.marsRovers;
  }
}
