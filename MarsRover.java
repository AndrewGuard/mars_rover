import java.util.*;

public class MarsRover {
  private ArrayList<String> position;

  private int xLocation;
  private int yLocation;
  private char cardinalDirection;

  public MarsRover(ArrayList<String> startingLocation, ArrayList<String> roverInstructions){

    String x = startingLocation.get(0);
    int xLocation = Integer.parseInt(x);

    String y = startingLocation.get(1);
    int yLocation = Integer.parseInt(y);

    String facing = startingLocation.get(2);
    char cardinalDirection = facing.charAt(0);

    position = new ArrayList<String>();
    roverCounter++;
  }

  public static int roverCounter = 0;

  private void moveStraight() {
  }

  private void turnRight() {
  }

  private void turnLeft() {
  }

  public String finalPosition(){
    // long method, return a string after iterating over array
    String finalCoordinates = "";
    return finalCoordinates;
  }

  public static void main (String[] args) {
    ArrayList<String> input;
    Plateau plateau = new Plateau();

    plateau.getPlateauDimensions();

    UtilityHelper helper = new UtilityHelper(args[0]);
    input = helper.getRoverInput(args[0]);
    input.remove(0);
    System.out.println("input1: " + input);

    System.out.println("input size: " + input.size());

    for (int i = 0; i < input.size(); i = i + 2) {
      int x = i;
      int y = i + 1;
      helper.createMarsRovers(x, y);
      System.out.println("Iterating in the foor loop time #: " + x);
    }

    System.out.println("input2: " + input);

    // helper.createMarsRovers();



// ==============================
    // directions.remove(0);
    // // int instructionLength = directions.size();
    // // int numberRovers = (instructionLength / 2);

    // while (directions.size() > 0) {
    //   marsRovers.add(new MarsRover(this.getStartingLocation(), this.getInstructions()));
    //   directions.remove(0);
    //   directions.remove(1);
    // }

    // while (!marsRovers.isEmpty()) {
    //   System.out.println("Iterating in main!");
    //   marsRovers.remove(0, 1);
    // }

// ==============================

    // MarsRover rovers = new MarsRover(helper.getStartingLocation(), helper.getInstructions());

    // // while loop after stripping first line, removing 2 lines at a time, pass to new rover,

    // // iterate through every rover, for loop here for each rover

    // call create createmarsrovers
    // for loop through the return value arraylist in main
    // print out finalPositions
  }

}
