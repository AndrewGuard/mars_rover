import java.util.*;

public class RoverLocation {
  private ArrayList<String> startingLocation = new ArrayList<String>();
  private LaunchHelper launchHelper = new LaunchHelper();

// Returns [1, 2, N] - second text line of input
  public ArrayList<String> getStartingLocation() {
    String coordinates = launchHelper.getRoverInput().get(1);
    String[] grid = coordinates.split(" ");

    for (int i= 0; i < 3; i++) {
      startingLocation.add(grid[i]);
    }
    System.out.println(startingLocation);
    return startingLocation;
  }


}
