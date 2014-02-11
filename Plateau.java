import java.util.*;

public class Plateau {
  private LaunchHelper launchHelper = new LaunchHelper();
  private ArrayList<String> plateauDimensions = new ArrayList<String>();

  public ArrayList<String> getPlateauDimensions() {
    String Dimensions = launchHelper.getRoverInput().get(0);
    String[] grid = Dimensions.split(" ");

    for (int i= 0; i < 2; i++) {
      plateauDimensions.add(grid[i]);
    }
    // System.out.println(plateauDimensions);
    return plateauDimensions;
  }
}
