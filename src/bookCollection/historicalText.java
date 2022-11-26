package bookCollection;

public class historicalText extends Book {

    /**
     * historicalText constructor
     * 
     * @param theTitle       Media Title
     * @param theGenre       Media Genre
     * @param theAuthor      Media Author
     * @param publishDate    Publication Date of Media
     * @param theDecimal     Dewey Decimal of Genre
     * @param borrow         Times Borrowed
     * @param yourReview     User's Opinion of Media
     * @param topicOfHistory Topic of History Covered
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
        return "--------------------------------------\n" +
                "Title: " + getTitle() + "\n" +
                "Genre: " + getGenre() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "Date Published: " + getPublishDate() + "\n" +
                "Dewey Decimal: " + getDecimal() + "\n" +
                "Topic of History: " + getHistory() + "\n";
    }
}
