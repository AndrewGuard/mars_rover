import java.util.regex.Pattern;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class CreateGrid {
  public static void main(String[] args) throws FileNotFoundException {

    Scanner scanner = new Scanner(new File("mars_rover_input.txt"));
    System.out.println("Printing:");
    while (scanner.hasNextLine()) System.out.println(scanner.nextLine());

  }
}
