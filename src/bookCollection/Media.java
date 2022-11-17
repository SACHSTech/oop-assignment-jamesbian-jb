package bookCollection;

public abstract class Media {



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
    

    public abstract int overallFame();

}
