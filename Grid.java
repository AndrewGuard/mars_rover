import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CreateGrid {

  private static void readFile(String fileName) {
   try {
     Scanner scanner = new Scanner(new File(fileName));
     scanner.useDelimiter(System.getProperty("line.separator"));
     while (scanner.hasNext()) {
       System.out.println(scanner.next());
     }
       scanner.close();
     } catch (FileNotFoundException e) {
       e.printStackTrace();
     }
   }

   public static void main(String[] args) {
     if (args.length != 1) {
       System.err.println("Please type in a file to parse");
       System.exit(0);
     }
     readFile(args[0]);
   }
 }
