import java.util.*;

public class Movement {

  private ArrayList<String> startingLocation = new ArrayList<String>();
  private ArrayList<String> roverInstructions = new ArrayList<String>();

  private LaunchHelper launchHelper = new LaunchHelper();

  public ArrayList<String> getStartingLocation() {
    String coordinates = launchHelper.getRoverInput().get(1);
    String[] grid = coordinates.split(" ");

    for (int i= 0; i < 3; i++) {
      startingLocation.add(grid[i]);
    }
    System.out.println("startingLocation: " + startingLocation);
    return startingLocation;
  }

  public ArrayList<String> getInstructions() {
    String instructions = launchHelper.getRoverInput().get(2);

    String[] input = instructions.split("");

    for (int i= 0; i < input.length; i++) {
      roverInstructions.add(input[i]);
    }

    roverInstructions.remove(0);

    System.out.println("roverInstructions: " + roverInstructions);
    return roverInstructions;
  }
}
