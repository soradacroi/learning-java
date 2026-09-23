import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    int i = 0;
    Scanner scanner = new Scanner(System.in);
    while (i == 0) {
      int first_input = scanner.nextInt();
      String oparator = scanner.next();
      int second_input = scanner.nextInt();
      switch (oparator) {
        case "+":
          System.out.println(first_input + second_input);
          break;
        case "-":
          System.out.println(first_input - second_input);
          break;
      }
      if (!oparator.equals("+")
          && !oparator.equals("-")) {
        System.out.println(compareNum(first_input, second_input, oparator));
      }
    }
    scanner.close();
  }

  public static boolean compareNum(int a, int b, String oparator) {
    if (oparator.equals("="))
      return a == b;
    else if (oparator.equals(">"))
      return a > b;
    else if (oparator.equals("<"))
      return a < b;

    return false;
  }
}
