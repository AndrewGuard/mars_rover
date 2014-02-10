import java.util.*;

public class RoverLocation {
  private ArrayList<String> location = new ArrayList<String>();

  public ArrayList<String> getStartingLocation() {
    String coordinates = launchHelper.getRoverInput().get(1);
    String[] grid = coordinates.split(" ");

    for (int i= 0; i < 2; i++) {
      plateuCoordinates.add(grid[i]);
    }
    System.out.println(plateuCoordinates);
  }
}
