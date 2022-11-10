package bookCollection;

public class Magazine extends Book{

    private String extraFeature;


    public Magazine(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, boolean hasOnline,int numCopies,int borrow, String extraContent) {

        super(theTitle, theGenre, theAuthor, publishDate, theDecimal, hasOnline, borrow, numCopies);
        extraFeature = extraContent;

    }

    public String getExtraFeature() {
        return extraFeature;
    }

}
