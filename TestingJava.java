import java.io.*;
import java.util.*;

public class TestingJava {
  public static int addOne(int x){
    x = x + 1;
    return x;
  }

  public static void main(String[] args) {
    int z = Integer.parseInt(args[0]);
    int y = addOne(z);
    System.out.println(y);
  }
}

