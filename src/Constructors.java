public class Constructors {
  char a, b;
  int x, y;
  boolean hasChanged = false;

  // normal Constructor
  public Constructors(char a) {
    this.a = a;
  }

  // we over loaded it on the one above
  public Constructors(char a, char b, int x, int y) {
    this.a = a;
    this.b = b;
    this.x = x;
    this.y = y;
    this.hasChanged = true;
  }

  // copy Constructor
  public Constructors(Constructors other) {
    this(other.a, other.b, other.x, other.y);
  }

  public String getAll() {
    if (hasChanged) {
      return "" + a + b + x + y;
    }
    return "" + a + b;
  }

  public static void main(String[] args) {
    Constructors obj = new Constructors('a');
    System.out.println(obj.getAll());
    Constructors obj_sec = new Constructors('a', 'b', 1, 2);
    System.out.println(obj_sec.getAll());
    Constructors other_obj = new Constructors(obj_sec);
    System.out.println(other_obj.getAll());
  }
}
