import java.io.*;
import java.util.*;

public class DoMath {
  public static void main(String[] args) {

    int z = Integer.parseInt(args[0]);

    int added               = AddOne.addOne(z);
    int multiplied          = MultiplyThree.multiplyThree(z);
    int exponent_two        = Exponent.exponentTwo(z);
    int exponent_three      = Exponent.exponentThree(z);

    System.out.println(added);
    System.out.println(multiplied);
    System.out.println(exponent_two);
    System.out.println(exponent_three);

  }
}

