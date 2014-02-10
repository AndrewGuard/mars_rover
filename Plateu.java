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
    }

    int plateuLength = Integer.parseInt(plateuCoordinates.get(0));
    int plateuHeight = Integer.parseInt(plateuCoordinates.get(0));

    // System.out.println("plateuLength: " + plateuLength);
    // System.out.println("plateuHeight: " + plateuHeight);

    for (int x=0; x < plateuLength; x++) {
      for (int y=0; y < plateuHeight; y++) {
        System.out.println("x: " + x + " y: " + y);
      }
    }
  }
}
