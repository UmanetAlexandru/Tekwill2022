public class Main {
  public static void main(String[] args) {
    Runnable runnable = Create.createRunnable("Hello2!", 5);
    runnable.run();
  }
}
