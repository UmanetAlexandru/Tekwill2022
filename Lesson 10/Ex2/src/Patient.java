class Patient {
  private static String name;
  private static String[] names = new String[10];

  public Patient(String name) {
    this.name = name;
  }

  public void say() {
    System.out.println("Hello, my name is " + name + ", I need a doctor.");
  }
}