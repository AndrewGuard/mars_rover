// TODO DELETE

// import java.util.*;

// public class Movement {

//   private ArrayList<String> startingLocation = new ArrayList<String>();
//   private ArrayList<String> roverInstructions = new ArrayList<String>();
//   private ArrayList<String> roverLocation = new ArrayList<String>();

//   // private LaunchHelper launchHelper = new LaunchHelper();

//   private ArrayList<String> getStartingLocation() {
//     String coordinates = LaunchHelper.getRoverInput().get(1);
//     String[] grid = coordinates.split(" ");

//     for (int i= 0; i < 3; i++) {
//       startingLocation.add(grid[i]);
//     }

//     System.out.println("startingLocation: " + startingLocation);
//     return startingLocation;
//   }

//   public ArrayList<String> getInstructions() {
//     String instructions = LaunchHelper.getRoverInput().get(2);

//     String[] input = instructions.split("");

//     for (int i= 0; i < input.length; i++) {
//       roverInstructions.add(input[i]);
//     }

//     roverInstructions.remove(0);

//     System.out.println("roverInstructions in getInstructions(): " + roverInstructions);
//     return roverInstructions;
//   }

// // Will make private later
//   // TODO: add movement
//   public ArrayList<String> moveRover() {
//     getInstructions();
//     System.out.println("roverInstructions in moveRover(): " + roverInstructions);
//     return roverLocation;
//   }

//   // Will be a wrapper for moveRover() if necessary
//   // public ArrayList<String> roverLocation() {
//   //   roverLocation = getStartingLocation();
//   //   System.out.println("roverLocation: " + roverLocation);
//   //   return roverLocation;
//   // }
// }
