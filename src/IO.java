import java.io.Console;
import java.util.Scanner;

public class IO {
  public static void main(String[] args) {
    Console cons = System.console();
    String username = cons.readLine("Enter your username: ");
    char[] password = cons.readPassword("Enter your password: ");
    System.out.print("give your bio: \n");
    String bio;
    try (Scanner scan = new Scanner(System.in)) {
      bio = scan.nextLine();
    }
    System.out.print("your username is " + username + " and ");
    System.out.println("your password is " + String.valueOf(password));
    System.out.println("your bio is: " + bio);

  }
}
