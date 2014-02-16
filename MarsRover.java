import java.util.*;

public class MarsRover {
  private int xLocation;
  private int yLocation;
  private char cardinalDirection;
  private ArrayList<String> instructions;

  public MarsRover(ArrayList<String> startingLocation, ArrayList<String> roverInstructions){

    String x = startingLocation.get(0);
    int xLocation = Integer.parseInt(x);

    String y = startingLocation.get(1);
    int yLocation = Integer.parseInt(y);

    String facing = startingLocation.get(2);
    char cardinalDirection = facing.charAt(0);

    instructions = roverInstructions;
  }

  private void moveStraight() {
  }

  private void turnRight() {
  }

  private void turnLeft() {
  }

  public String finalPosition(){
    String finalCoordinates = "";

    for (int i = 0; i < instructions.size(); i++) {
      System.out.println("Got to finalPostion FOR LOOP, baby!" + i);
    }

    return finalCoordinates;
  }

  public static void main (String[] args) {
    ArrayList<String> input;
    ArrayList<MarsRover> marsRovers = new ArrayList<MarsRover>();

    Plateau plateau = new Plateau();
    plateau.getPlateauDimensions();

    UtilityHelper helper = new UtilityHelper(args[0]);
    input = helper.getRoverInput(args[0]);
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
