import java.util.*;

public class Plateau {
  // private LaunchHelper launchHelper = new LaunchHelper();
  private ArrayList<String> plateauDimensions = new ArrayList<String>();

  public ArrayList<String> getPlateauDimensions() {
    String dimensions = LaunchHelper.getRoverInput().get(0);
    String[] grid = dimensions.split(" ");

    for (int i= 0; i < 2; i++) {
      plateauDimensions.add(grid[i]);
    }

    String x_bearing = plateauDimensions.get(0);
    String y_bearing = plateauDimensions.get(1);

    int x = Integer.parseInt(x_bearing);
    int y = Integer.parseInt(y_bearing);

    // System.out.println("plateauDimensions: " + plateauDimensions);
    // System.out.println("x: " + x);
    // System.out.println("y: " + y);

    return plateauDimensions;
  }
}
