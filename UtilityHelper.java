import java.util.*;
import java.io.*;

public class UtilityHelper {
  private ArrayList<String> startingLocation = new ArrayList<String>();
  private ArrayList<String> roverInstructions = new ArrayList<String>();
  private ArrayList<String> roverLocation = new ArrayList<String>();

  private ArrayList<String> directions;
  //private ArrayList<String> roverdirections = new ArrayList<String>();

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
    System.out.println("Got Here - GetRoverInput");

    return roverInput;
  }

  // get paired lines from input and use them to create a rover with instrucions
  // int / 2, iterate that n times from index 1
  // private MarsRover createMarsRover(int roverNum){
  //   MarsRover rover = new MarsRover();

  //   return rover;
  // }

// remove 1st line - the grid dimensions
  public ArrayList<MarsRover> createMarsRovers(){
    ArrayList<MarsRover> marsRovers = new ArrayList<MarsRover>();
// while loop here to create them


    // populate marsRovers list
    // remove 1st 2 lines on input
    // create a new MarsRover with those 2 lines
    // put that MarsRover into marsRovers list

    return marsRovers;
  }

  public ArrayList<String> getStartingLocation() {
    String coordinates = LaunchHelper.getRoverInput().get(1);
    String[] grid = coordinates.split(" ");

    for (int i= 0; i < 3; i++) {
      startingLocation.add(grid[i]);
    }

    System.out.println("startingLocation: " + startingLocation);
    return startingLocation;
  }

  public ArrayList<String> getInstructions() {
    String instructions = LaunchHelper.getRoverInput().get(2);
    String[] input = instructions.split("");

    for (int i= 0; i < input.length; i++) {
      roverInstructions.add(input[i]);
    }
    roverInstructions.remove(0);

    System.out.println("roverInstructions in getInstructions(): " + roverInstructions);
    return roverInstructions;
  }

// Will make private later
  // TODO: add movement
  public ArrayList<String> moveRover() {
    getInstructions();
    System.out.println("roverInstructions in moveRover(): " + roverInstructions);
    return roverLocation;
  }

  // Will be a wrapper for moveRover() if necessary
  // public ArrayList<String> roverLocation() {
  //   roverLocation = getStartingLocation();
  //   System.out.println("roverLocation: " + roverLocation);
  //   return roverLocation;
  // }
}
