public class Rover {


  public static void main(String[] args) {
    if (args.length != 1) {
       System.err.println("Please type in a file to parse");
       System.exit(0);
     }
     readFile(args[0]);
  }
}
