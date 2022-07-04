public class Publication {
    private final String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType() + getDetails() + ": " + getTitle();
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return "";
    }

    public String getTitle() {
        return title;
    }
}