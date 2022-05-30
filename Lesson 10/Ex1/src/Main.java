public class Main {

  public static void main(String[] args) {
    Counter c = new Counter(10);
    System.out.println(c.getCurrent());
    c.inc();
    c.inc();
    System.out.println(c.getCurrent());
    c.inc();
    c.inc();
    System.out.println(c.getCurrent());


  }
}
