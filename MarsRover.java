import java.util.*;

public class MarsRover {
  private ArrayList<String> position;

  private ArrayList<MarsRover> marsRovers = new ArrayList<MarsRover>();

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

    for (int i = 0; i < input.size(); i = i + 2) {
      int x = i;
      int y = i + 1;
      helper.createMarsRovers(x, y);
    }

    // returns arraylist of rover objects
    helper.getRovers();

    // System.out.println("thing" + helper.getRovers());

    for (int i = 0; i < roverCounter; i++) {
      System.out.println("roverCounter: " + i);
      // HOW TO ACCESS marsRover arraylist HERE???
    }

    // this.getRovers();

    // for (int i = 0; i < this.marsRovers.size(); i++) {
    //   System.out.println("Iterating over rovers!");
    // }

  }
}

