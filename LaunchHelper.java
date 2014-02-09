import java.util.*;
import java.io.*;

public class LaunchHelper {

  private ArrayList<String> roverInput = new ArrayList<String>();

  public ArrayList getRoverInput(String[] args) throws FileNotFoundException {
    Scanner lineScanner = new Scanner(new File(args[0]));
    while (lineScanner.hasNextLine()) {
      String nextLine = lineScanner.nextLine();
      roverInput.add(nextLine);
    }
    return roverInput;
  }

  // // Testing purposes here ONLY
  // public ArrayList main() {
  //   return roverInput;
  // }
}
