package bookCollection;

public class Magazine extends Book {

    private String extraFeature;

    public Magazine(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, int borrow, String yourReview, String extraContent) {

        super(theTitle, theGenre, theAuthor, publishDate, theDecimal, borrow, yourReview);
        extraFeature = extraContent;

    }

    public String getExtraFeature() {
        return extraFeature;
    }

    public String toString() {
        System.out.println("--------------------------------------");
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Author: " + getAuthor());
        System.out.println("Date Published: " + getPublishDate());
        System.out.println("Dewey Decimal: " + getDecimal());
        System.out.println("Bonus Sections: " + getExtraFeature());

        return "--------------------------------------";
        
    }
}
