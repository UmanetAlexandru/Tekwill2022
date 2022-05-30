class Counter {
  private int current;

  public Counter(int current) {
    this.current = current;
  }

  public void inc() {
    current++;
  }

  public int getCurrent() {
    return current;
  }
}