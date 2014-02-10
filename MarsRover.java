import java.util.*;
import java.io.*;

public class MarsRover {

  private LaunchHelper launchHelper = new LaunchHelper();
  private ArrayList<String> plateuCoordinates = new ArrayList<String>();

  private void createPlateu() {
    String coordinates = launchHelper.getRoverInput().get(0);
    String[] grid = coordinates.split(" ");

    for (int i= 0; i < 2; i++) {
      plateuCoordinates.add(grid[i]);
      // System.out.println(plateuCoordinates.get(i));
    }

    for (String dimension : plateuCoordinates) {

    }
  }

  // private void moveRover() {

  // }

  // private void outputCoordinates() {

  // }

  public static void main (String[] args) {
    MarsRover rover = new MarsRover();
    rover.createPlateu();
    // rover.moveRover();
    // rover.outputCoordinates();
  }
}
