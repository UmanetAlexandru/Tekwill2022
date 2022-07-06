class Book {
    String title;
    int yearOfPublishing;
    String[] authors;

    public Book(String t, int y, String[] a) {
        title = t;
        yearOfPublishing = y;
        authors = java.util.Arrays.copyOf(a, a.length);
    }
}
