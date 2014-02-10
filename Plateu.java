import java.util.*;
import java.io.*;

public class Plateu {
  private LaunchHelper launchHelper = new LaunchHelper();
  private ArrayList<String> plateuCoordinates = new ArrayList<String>();

  public void createPlateu() {
    String coordinates = launchHelper.getRoverInput().get(0);
    String[] grid = coordinates.split(" ");

    for (int i= 0; i < 2; i++) {
      plateuCoordinates.add(grid[i]);
      // System.out.println(plateuCoordinates.get(i));
    }

    int plateuLength = Integer.parseInt(plateuCoordinates.get(0));
    int plateuHeight = Integer.parseInt(plateuCoordinates.get(0));

    System.out.println("plateuLength: " + plateuLength);
  }


}
