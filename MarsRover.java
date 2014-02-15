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
    Plateau plateau = new Plateau();

    // To return plateau dimensions before removing the line from the .txt file
    plateau.getPlateauDimensions();

    UtilityHelper helper = new UtilityHelper(args[0]);
    // TODO - set arg to a variable, clean up code here
    helper.createMarsRovers(helper.getRoverInput(args[0]));

    // while (!marsRovers.isEmpty()) {
    //   System.out.println("Iterating in main!");
    //   marsRovers.remove(0, 1);
    // }


    // MarsRover rovers = new MarsRover(helper.getStartingLocation(), helper.getInstructions());

    // // while loop after stripping first line, removing 2 lines at a time, pass to new rover,

    // // iterate through every rover, for loop here for each rover

    // call create createmarsrovers
    // for loop through the return value arraylist in main
    // print out finalPositions
  }

}
