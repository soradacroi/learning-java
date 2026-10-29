// inheritance 

/* the process of re-using the properties from existing class.
 * parent class (aka super class)- the class whose properties are inherited
 * child class (or sub class) - the class who is inheriting
 *
 * A subclass extends parent class (cannot see private components) */

public class Inheritance {
  private String username;
  private String password;

  // constructor
  public Inheritance(String username, String password) {
    this.username = username;
    this.password = password;
  }

  // accessors
  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public static void main(String[] args) {
    // lets see how it works Inheritance -> ChildINheritance
    // using the class using type casting
    Inheritance my_account = new ChildInheritance("ashura", "password123", "ashura@something");
    System.out.println(((ChildInheritance) my_account).getEmail());

    // using the class
    ChildInheritance my_acc = new ChildInheritance("a", "p", "a@a");
    System.out.println(my_acc.getEmail());
  }
}
