package bookCollection;

public abstract class Media {

    /**
     * Media constructor
     * 
     * @param title          Media Title
     * @param genre          Media Genre
     * @param author         Media Author
     * @param date           Publication Date of Media
     * @param theDecimal     Unique Book ID
     * @param timesBorrowed  Total Times Borrowed
     * @param personalReview User's Opinion of Media
     * @author J.Bian
     */

    private String title;
    private String genre;
    private String author;
    private int date;
    private double theDecimal;
    private int timesBorrowed;
    private String personalReview;

    public Media(String title, String genre, String author, int date, double theDecimal, int timesBorrowed,
            String personalReview) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.date = date;
        this.theDecimal = theDecimal;
        this.timesBorrowed = timesBorrowed;
        this.personalReview = personalReview;
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
        return theDecimal;
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

    public void setdDecimal(double theDecimal) {
        this.theDecimal = theDecimal;
    }

    public void setTimesBorrowed(int timesBorrowed) {
        this.timesBorrowed = timesBorrowed;
    }

    public void setPersonalReview(String personalReview) {
        this.personalReview = personalReview;
    }

    public String toString() {
        return
            "--------------------------------------\n" + 
            "Title: "  + getTitle() + "\n" + 
            "Genre: " + getGenre() + "\n" + 
            "Author: " + getAuthor() + "\n" +
            "Date Published: " + getPublishDate() + "\n" + 
            "Dewey Decimal: " + getDecimal() + "\n" + 
            "Personal Review: " + getReview() + "\n";
    }

    // Intializing Abstract for subclasses to use
    public abstract int overallFame();

}
