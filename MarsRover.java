import java.io.*;
import java.util.*;

public class MarsRover {
  public static void main(String[] args) throws FileNotFoundException {
    File coordinatesFile = new File("mars_rover_input.txt");
    Scanner scan = new Scanner(coordinatesFile);
    String s = scan.nextLine();

    try {
      Integer.parseInt(s);
    }
    catch(NumberFormatException ex){
      System.out.println("Its not a valid Integer");
    }

    System.out.println(s);
  }
}

