public class BetterClass {
  private String u;

  // constructor
  public BetterClass(String u) {
    this.u = u;
  }

  public String getU() {
    return u;
  }

  public static void main(String[] args) {
    YES obj = new YES("this", "and that");
    System.out.print(obj.getU() + " ");
    System.out.println(obj.getP());
  }
}

class YES extends BetterClass {
  private String p;

  public YES(String u, String p) {
    super(u);
    this.p = p;
  }

  public String getP() {
    return p;
  }
}
