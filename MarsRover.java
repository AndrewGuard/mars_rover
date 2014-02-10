import java.util.*;
import java.io.*;

public class MarsRover {

  private LaunchHelper launchHelper = new LaunchHelper();
  private ArrayList<String> plateuCoordinates = new ArrayList<String>();

  private void createPlateu() {
    ArrayList<String> plateuCoordinates = launchHelper.getRoverInput();
    System.out.println(plateuCoordinates);
  }

  // private void moveRover() {

  // }

  // private void outputCoordinates() {

  // }

  public static void main () {
    MarsRover rover = new MarsRover();
    // rover.createPlateu(arg);
    // rover.moveRover();
    // rover.outputCoordinates();
  }
}
