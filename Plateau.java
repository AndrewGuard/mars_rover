import java.util.*;

public class Plateau {
  private ArrayList<String> plateauDimensions = new ArrayList<String>();

  public ArrayList<String> getPlateauDimensions(ArrayList<String> input) {
    String dimensions = input.get(0);
    String[] grid = dimensions.split(" ");

    for (int i= 0; i < 2; i++) {
      plateauDimensions.add(grid[i]);
    }

    return plateauDimensions;
  }
}
