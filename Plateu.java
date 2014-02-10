import java.util.*;

public class Plateu {
  private LaunchHelper launchHelper = new LaunchHelper();
  private ArrayList<String> plateuDimensions = new ArrayList<String>();

  public ArrayList<String> getPlateuDimensions() {
    String Dimensions = launchHelper.getRoverInput().get(0);
    String[] grid = Dimensions.split(" ");

    for (int i= 0; i < 2; i++) {
      plateuDimensions.add(grid[i]);
    }
    // System.out.println(plateuDimensions);
    return plateuDimensions;

  }
}






























// Pretty loops, useless here for now - TODO - delete prior to submission
    // int plateuLength = Integer.parseInt(plateuCoordinates.get(0));
    // int plateuHeight = Integer.parseInt(plateuCoordinates.get(1));

    // // System.out.println("plateuLength: " + plateuLength);
    // // System.out.println("plateuHeight: " + plateuHeight);

    // for (int x=0; x < plateuLength; x++) {
    //   for (int y=0; y < plateuHeight; y++) {
    //     System.out.println("x: " + x + " y: " + y);
    //   }
    // }
