import java.util.*;


public class MarsRover {
  private ArrayList<String> position = new ArrayList<String>();

  private void moveStraight() {
  }

  private void turnRight() {
  }

  private void turnLeft() {
  }

  // private ArrayList<String> roverPosition() {
  // }

  public static void main (String[] args) {
    Plateau plateau = new Plateau();
    MarsRover rover = new MarsRover();
    plateau.getPlateauDimensions();

    // RoverLocation location = new RoverLocation();
    // location.getStartingLocation();

    Movement instructions = new Movement();
    instructions.getInstructions();
    instructions.getStartingLocation();
  }

}
