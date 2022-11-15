package bookCollection;

public abstract class Media {
    private String title;
    private String genre;
    private String author;
    private int date;
    private double dDecimal;
    private int timesBorrowed;
    private String personalReview;

    public Media(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, int borrow, String yourReview) {
        title = theTitle;
        genre = theGenre;
        author = theAuthor;
        date = publishDate;
        dDecimal = theDecimal;
        timesBorrowed = borrow;
        personalReview = yourReview;

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

    public int getPublishDate() {
        return date;
    }

    public double getDecimal() {
        return dDecimal;
    }

    public int getBorrowed() {
        return timesBorrowed;
    }

    public String getReview() {
        return personalReview;
    }

    public abstract int overallFame();

}
