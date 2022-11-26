package bookCollection;

public class Magazine extends Book {

    /**
     * Magazine constructor
     * 
     * @param theTitle     Media Title
     * @param theGenre     Media Genre
     * @param theAuthor    Media Author
     * @param publishDate  Publication Date of Media
     * @param theDecimal   Dewey Decimal of Genre
     * @param borrow       Times Borrowed
     * @param yourReview   User's Opinion of Media
     * @param extraFeature Additional content inside Magazine
     * @author J.Bian
     */
    private String extraFeature;

    public Magazine(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, int borrow,
            String yourReview, String extraContent) {

        super(theTitle, theGenre, theAuthor, publishDate, theDecimal, borrow, yourReview);
        extraFeature = extraContent;

    }

    // Getter & Setter Methods
    public String getExtraFeature() {
        return extraFeature;
    }

    public void setExtraFeature(String extraFeature) {
        this.extraFeature = extraFeature;
    }

    // Returns all public information of Magazine
    public String toString() {
        return "--------------------------------------\n" +
                "Title: " + getTitle() + "\n" +
                "Genre: " + getGenre() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "Date Published: " + getPublishDate() + "\n" +
                "Dewey Decimal: " + getDecimal() + "\n" +
                "Extra Content: " + getExtraFeature()+ "\n";
    }
}
