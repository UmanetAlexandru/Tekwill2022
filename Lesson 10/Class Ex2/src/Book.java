import java.util.Arrays;

public class Book {
    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book() {
    }

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int year) {
        this.yearOfPublishing = year;
    }

    public String[] getAuthors() {
        return this.authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = Arrays.copyOf(authors, authors.length);
    }

    public void showTitleAndYear() {
        System.out.println("Title of this book is " + title + " and it was published in " + yearOfPublishing + " year");
    }
}
