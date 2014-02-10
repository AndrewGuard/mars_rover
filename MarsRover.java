public class MarsRover {

  private LaunchHelper launchHelper = new LaunchHelper();


  public static void main (String[] args) {
    Plateu plateu = new Plateu();
    MarsRover rover = new MarsRover();
    plateu.getPlateuDimensions();
    RoverLocation location = new RoverLocation();
    location.getStartingLocation();
  }

}
