package bookCollection;

public class Magazine extends Book {

    /**
     * Magazine constructor
     * 
     * @param theTitle     Media Title
     * @param theGenre     Media Genre
     * @param theAuthor    Media Author
     * @param publishDate  Publication Date of Media
     * @param theDecimal   Unique Magazine ID
     * @param borrow       Times Borrowed
     * @param yourReview   User's Opinion of Media
     * @param extraFeature Additional content featured inside Magazine
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
        return super.toString() +
                "Extra Content: " + getExtraFeature() + "\n";
    }
}
