import java.util.*;
import java.io.*;

public class LaunchHelper {

  private ArrayList<String> roverInput = new ArrayList<String>();

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
}
