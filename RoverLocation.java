import java.util.*;

public class RoverLocation {
  private ArrayList<String> startingLocation = new ArrayList<String>();

  public ArrayList<String> getStartingLocation() {
    String coordinates = launchHelper.getRoverInput().get(1);
    String[] grid = coordinates.split(" ");

    for (int i= 0; i < 2; i++) {
      startingLocation.add(grid[i]);
    }
    System.out.println(startingLocation);
    return startingLocation;
  }


}
