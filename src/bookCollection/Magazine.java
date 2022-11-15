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

}
