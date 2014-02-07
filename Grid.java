import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Grid {

  private static int[] readFile(String fileName) {
    try {
      Scanner sc = new Scanner(new File(fileName));
      while(sc.hasNextLine()) {
        String[] numstrs = sc.nextLine().split("\\s+"); // split by white space
        int[] nums = new int[numstrs.length];
        for(int i = 0; i < nums.length; i++) nums[i] = Integer.parseInt(numstrs[i]);
      }
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
