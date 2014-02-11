import java.util.*;

public class MovementInstructions {
  private ArrayList<String> roverInstructions = new ArrayList<String>();
  private LaunchHelper launchHelper = new LaunchHelper();

  public ArrayList<String> getInstructions() {
    String instructions = launchHelper.getRoverInput().get(2);

    String[] input = instructions.split("");

    for (int i= 0; i < input.length; i++) {
      roverInstructions.add(input[i]);
      // System.out.println("input: " + input[i]);
    }

    // To remove an initial empty value from String[] input
    roverInstructions.remove(0);

    System.out.println("roverInstructions: " + roverInstructions);
    return roverInstructions;
  }
}
