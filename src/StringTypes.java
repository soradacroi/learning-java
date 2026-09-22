public class StringTypes {
  public static void main(String[] args) {
    String frist = new String("hello world");
    System.out.println(frist);
    String second = "no new it works fine too and better";
    System.out.println(second);
    String message = "     Hello" + " World    ";
    System.out.println(message);
    System.out.println(message.length());
    System.out.println(message.startsWith("     Hello"));
    System.out.println(message.replace("World", "people"));
    System.out.println(message.toLowerCase());
    System.out.println(message.toUpperCase());
    System.out.println(message.trim());
    String new_string = "Hello \"User\" your drive is c:\\Windows\\...";
    System.out.println(new_string);
  }
}
