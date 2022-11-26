package bookCollection;

public abstract class Media {


    /**
     * Media constructor
     * 
     * @param title Media Title
     * @param genre Media Genre
     * @param author Media Author
     * @param date Publication Date of Media
     * @param dDecimal Dewey Decimal of Genre
     * @param timesBorrowed Total Times Borrowed
     * @param personalReview User's Opinion of Media
     * @author J.Bian
     */

    private String title;
    private String genre;
    private String author;
    private int date;
    private double dDecimal;
    private int timesBorrowed;
    private String personalReview;

    public Media(){}

    public Media(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, int borrow, String yourReview) {
        title = theTitle;
        genre = theGenre;
        author = theAuthor;
        date = publishDate;
        dDecimal = theDecimal;
        timesBorrowed = borrow;
        personalReview = yourReview;

    }

    // Getter & Setter Methods
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setdDecimal(double dDecimal) {
        this.dDecimal = dDecimal;
    }

    public void setTimesBorrowed(int timesBorrowed) {
        this.timesBorrowed = timesBorrowed;
    }

    public void setPersonalReview(String personalReview) {
        this.personalReview = personalReview;
    }
    
    // Intializing Abstract for subclasses to use
    public abstract int overallFame();

}
