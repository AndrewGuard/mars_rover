import java.util.*;


public class MarsRover {
  private ArrayList<String> position;

  private int xLocation;
  private int yLocation;
  private char cardinalDirection;

  public MarsRover(ArrayList<String> startingLocation, ArrayList<String> instructions){
    // parse from starting location
    String x = startingLocation.get(0);
    int xLocation = Integer.parseInt(x);

    String y = startingLocation.get(1);
    int yLocation = Integer.parseInt(y);

    String facing = startingLocation.get(2);
    char cardinalDirection = facing.charAt(0);
    // same for y, facing
    // position = new ArrayList<String>();
    // roverCounter++;
  }

  // public static int roverCounter = 0;

  private void moveStraight() {
  }

  private void turnRight() {
  }

  private void turnLeft() {
  }

  public String finalPosition(){
    // long method, return a string after iterating over array
  }

  public static void main (String[] args) {
    // pass args[0] to launch helper
    Plateau plateau = new Plateau();
    UtilityHelper helper = new UtilityHelper(args[0]);
    MarsRover rover = new MarsRover();
    plateau.getPlateauDimensions();

    // movement.getInstructions();
    // movement.roverLocation();

    // iterate through every rover, for loope here for each rover
  }

}
