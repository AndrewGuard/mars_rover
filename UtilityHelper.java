import java.util.*;
import java.io.*;

public class UtilityHelper {
  private ArrayList<String> startingLocation = new ArrayList<String>();
  private ArrayList<String> roverInstructions = new ArrayList<String>();
  private ArrayList<String> roverLocation = new ArrayList<String>();
  private ArrayList<String> input = new ArrayList<String>();
  private ArrayList<MarsRover> marsRovers = new ArrayList<MarsRover>();
  private ArrayList<String> directions;

  public UtilityHelper(String filePath){
    directions = getRoverInput(filePath);
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
      System.out.println("Something is wrong with the rover instructions.");
    }
    return roverInput;
  }

  public ArrayList<MarsRover> createMarsRovers(ArrayList<String> directions){
    directions.remove(0);
    // int instructionLength = directions.size();
    // int numberRovers = (instructionLength / 2);

    while (directions.size() > 0) {
      marsRovers.add(new MarsRover(this.getStartingLocation(), this.getInstructions()));
      directions.remove(0);
      directions.remove(1);
    }
    return marsRovers;
  }

  public ArrayList<String> getStartingLocation() {
    String coordinates = directions.get(0);
    String[] grid = coordinates.split(" ");

    for (int i= 0; i < 3; i++) {
      startingLocation.add(grid[i]);
    }

    System.out.println("startingLocation: " + startingLocation);
    return startingLocation;
  }

  public ArrayList<String> getInstructions() {
    String instructions = directions.get(1);
    String[] input = instructions.split("");

    for (int i= 0; i < input.length; i++) {
      roverInstructions.add(input[i]);
    }
    roverInstructions.remove(0);

    System.out.println("roverInstructions in getInstructions(): " + roverInstructions);
    return roverInstructions;
  }
}





// Will make private later
  // // TODO: add movement
  // public ArrayList<String> moveRover() {
  //   getInstructions();
  //   System.out.println("roverInstructions in moveRover(): " + roverInstructions);
  //   return roverLocation;
  // }

  // // Will be a wrapper for moveRover() if necessary
  // // public ArrayList<String> roverLocation() {
  // //   roverLocation = getStartingLocation();
  // //   System.out.println("roverLocation: " + roverLocation);
  // //   return roverLocation;
  // // }
