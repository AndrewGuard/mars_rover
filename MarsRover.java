import java.util.*;

public class MarsRover {
  private int xLocation;
  private int yLocation;
  private String cardinalDirection;
  private ArrayList<String> instructions;

  public MarsRover(ArrayList<String> startingLocation, ArrayList<String> roverInstructions){

    String x = startingLocation.get(0);
    xLocation = Integer.parseInt(x);

    String y = startingLocation.get(1);
    yLocation = Integer.parseInt(y);

    cardinalDirection = startingLocation.get(2);

    instructions = roverInstructions;
  }

  private void moveStraight() {
    switch (cardinalDirection) {
      case "N":
        yLocation += 1;
        break;
      case "S":
        yLocation -= 1;
        break;
      case "E":
        xLocation += 1;
        break;
      case "W":
        xLocation -= 1;
        break;
    }
  }

  private void turnRight() {
    switch (cardinalDirection) {
      case "N":
        cardinalDirection = "E";
        break;
      case "E":
        cardinalDirection = "S";
        break;
      case "S":
        cardinalDirection = "W";
        break;
      case "W":
        cardinalDirection = "N";
        break;
    }
  }

  private void turnLeft() {
    switch (cardinalDirection) {
      case "N":
        cardinalDirection = "W";
        break;
      case "W":
        cardinalDirection = "S";
        break;
      case "S":
        cardinalDirection = "E";
        break;
      case "E":
        cardinalDirection = "N";
        break;
    }
  }

  public String finalPosition(){
    String finalCoordinates = "";

    for (int i = 0; i < instructions.size(); i++) {
      switch (instructions.get(i)) {
        case "M":
          moveStraight();
          break;
        case "L":
          turnLeft();
          break;
        case "R":
          turnRight();
          break;
      }
    }

    String xValue = Integer.toString(xLocation);
    String yValue = Integer.toString(yLocation);

    finalCoordinates = xValue + " " + yValue + " " + cardinalDirection;

    System.out.println("finalCoordinates for rover: " + finalCoordinates);
    return finalCoordinates;
  }

  public static void main (String[] args) {
    ArrayList<String> input;
    ArrayList<MarsRover> marsRovers = new ArrayList<MarsRover>();

    UtilityHelper helper = new UtilityHelper(args[0]);
    input = helper.getRoverInput(args[0]);

    Plateau plateau = new Plateau();
    plateau.getPlateauDimensions(input);

    input.remove(0);

    for (int i = 0; i < input.size(); i = i + 2) {
      int x = i;
      int y = i + 1;
      marsRovers.add(helper.createMarsRover(x, y));
    }

    for (int i = 0; i < marsRovers.size(); i++) {
      marsRovers.get(i).finalPosition();
    }
  }
}
