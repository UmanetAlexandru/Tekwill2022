public class RunnableImpl implements Runnable {
  private String text;
  private int repeats;

  public RunnableImpl(String text, int repeats) {
    this.text = text;
    this.repeats = repeats;
  }

  @Override
  public void run() {
    for (int i = 0; i < repeats; i++) {
      System.out.println(text);
    }
  }
}
