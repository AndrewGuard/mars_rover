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

  // public String finalPosition(){
  //   // long method, return a string after iterating over array
  // }

  public static void main (String[] args) {
    UtilityHelper helper = new UtilityHelper(args[0]);
    // helper.getStartingLocation();
    // helper.getInstructions();

    MarsRover rover1 = new MarsRover(helper.getStartingLocation(), helper.getInstructions());

    // UtilityHelper startup = new UtilityHelper(args[0]);
    // startup.getRoverInput();

    // // while loop after stripping first line, removing 2 lines at a time, pass to new rover,
    // MarsRover rover = new MarsRover();

    // Plateau plateau = new Plateau();
    // UtilityHelper helper = new UtilityHelper(args[0]);
    // MarsRover rover = new MarsRover();
    // plateau.getPlateauDimensions();

    // helper.getInstructions();
    // helper.moveRover();

    // // iterate through every rover, for loop here for each rover



    // call create createmarsrovers
    // for loop through the return value arraylist in main
    // print out finalPositions
  }

}
