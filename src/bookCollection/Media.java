package bookCollection;

public abstract class Media {
    private String title;
    private String genre;
    private String author;
    private int date;
    private double dDecimal;
    private int timesBorrowed;

    public Media(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, int borrow) {
        title = theTitle;
        genre = theGenre;
        author = theAuthor;
        date = publishDate;
        dDecimal = theDecimal;
        timesBorrowed = borrow;

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

    public abstract int overallFame();

}
