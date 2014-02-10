import java.util.*;
import java.io.*;

public class MarsRoverTest {

  private LaunchHelper launchHelper = new LaunchHelper();
  private ArrayList<String> roverInput = new ArrayList<String>();

    // private void createPlateu(String arg) {
    //   ArrayList<String> plateuCoordinates = launchHelper.getRoverInput(arg);
    //   System.out.println(plateuCoordinates);
    // }

  private ArrayList<String> getRoverInput(){
    try {
      Scanner s = new Scanner(new File("mars_rover_input.txt"));
      while (s.hasNextLine()) {
        roverInput.add(s.nextLine());
      }
      s.close();
    } catch (Exception e) {
      System.out.println("Something is wrong with the rover instructions.");
    }
    return roverInput;
  }

  public static void main () {
    MarsRoverTest rover = new MarsRoverTest();
    rover.getRoverInput();
    // rover.moveRover();
    // rover.outputCoordinates();
  }
}

  // private void loadFile(File "mars_rover_input.txt") {
  //   roverInput = new ArrayList<RoverInstructions>();
  //   try {
  //     BufferedReader reader = new BufferedReader(new FileReader(file));
  //     String line = null;
  //     while ((line = reader.readLine()) != null) {
  //       makeInstructions(line);
  //     }
  //     reader.close();
  //   } catch (Exception ex) {
  //     System.out.println("PROBLEM");
  //     ex.printStackTrace();
  //   }
  //   optionalMethodHere();
  // }

  // private void makeInstructions() {}

  // private void optionalMethodHere() {}

  // private void moveRover() {

  // }

  // private void outputCoordinates() {

  // }
