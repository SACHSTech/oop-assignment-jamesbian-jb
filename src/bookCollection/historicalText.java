package bookCollection;

public class historicalText extends Book {

    /**
     * historicalText constructor
     * 
     * @param theTitle       Media Title
     * @param theGenre       Media Genre
     * @param theAuthor      Media Author
     * @param publishDate    Publication Date of Media
     * @param theDecimal     Unique Historical Text ID
     * @param borrow         Times Borrowed
     * @param yourReview     User's Opinion of Media
     * @param topicOfHistory Topic of History historicalText Covers
     * @author J.Bian
     */

    private String topicOfHistory;

    public historicalText(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal,
            int borrow, String yourReview, String historyType) {

        super(theTitle, theGenre, theAuthor, publishDate, theDecimal, borrow, yourReview);
        topicOfHistory = historyType;

    }

    // Getter Method
    public String getHistory() {
        return topicOfHistory;
    }

    // Returns all information of historicalText
    public String toString() {
        return super.toString() +
                "Topic of History: " + getHistory() + "\n";
    }
}
