import java.io.*;
import java.util.*;

public class DoMath {
  public static void main(String[] args) {

    long z = Integer.parseInt(args[0]);

    long added               = AddOne.addOne(z);
    long multiplied          = MultiplyThree.multiplyThree(z);
    long exponent_two        = Exponent.exponentTwo(z);
    long exponent_three      = Exponent.exponentThree(z);

    System.out.println(added);
    System.out.println(multiplied);
    System.out.println(exponent_two);
    System.out.println(exponent_three);

  }
}

