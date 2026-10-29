public class ChildInheritance extends Inheritance {
  private String email;

  public ChildInheritance(String username, String password, String email) {
    super(username, password);
    this.email = email;
  }

  public String getEmail() {
    return email;
  }
}
