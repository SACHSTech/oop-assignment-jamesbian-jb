package bookCollection;

public class Media {
    private String title;
    private String genre;
    private String author;
    private int date;
    private double dDecimal;

    public Media(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal) {
        title = theTitle;
        genre = theGenre;
        author = theAuthor;
        date = publishDate;
        dDecimal = theDecimal;

    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public int publishDate() {
        return date;
    }

    public double getDecimal() {
        return dDecimal;
    }

}
