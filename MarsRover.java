public class MarsRover {

  private LaunchHelper launchHelper = new LaunchHelper();


  public static void main (String[] args) {
    Plateau plateau = new Plateau();
    MarsRover rover = new MarsRover();
    plateau.getPlateauDimensions();


    RoverLocation location = new RoverLocation();
    location.getStartingLocation();
  }

}
