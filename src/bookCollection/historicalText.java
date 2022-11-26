package bookCollection;

public class historicalText extends Book {

    private String topicOfHistory;

    public historicalText(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, int borrow, String yourReview, String historyType) {

        super(theTitle, theGenre, theAuthor, publishDate, theDecimal, borrow, yourReview);
        topicOfHistory = historyType;

    }

    public String getHistory() {
        return topicOfHistory;
    }

    public String toString() {
        System.out.println("--------------------------------------");
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Author: " + getAuthor());
        System.out.println("Date Published: " + getPublishDate());
        System.out.println("Dewey Decimal: " + getDecimal());
        System.out.println("Type of History: " + getHistory());

        return "-";
        
    }
}
