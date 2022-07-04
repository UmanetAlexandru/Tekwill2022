public class Article extends Publication {
    private final String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getType() {
        return "Article";
    }

    public String getDetails() {
        return " (author - " + author + ")";
    }
}
