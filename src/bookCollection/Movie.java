package bookCollection;

public class Movie extends Media {

    private String ageAdvised;
    private boolean describedVideo;

    public Movie(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal,
            String ageRestrict, String yourReview, boolean hasDescribed, int borrow) {

        super(theTitle, theGenre, theAuthor, publishDate, theDecimal, borrow, yourReview);
        ageAdvised = ageRestrict;
        describedVideo = hasDescribed;
    }

    public String getAgeAdvised() {
        return ageAdvised;
    }

    public boolean getDescribed() {
        return describedVideo;
    }

    public int overallFame() {
        return (getBorrowed() / getPublishDate());
    }

    public void setAgeAdvised(String ageAdvised) {
        this.ageAdvised = ageAdvised;
    }

    public void setDescribedVideo(boolean describedVideo) {
        this.describedVideo = describedVideo;
    }

    public String toString() {
        System.out.println("--------------------------------------");
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Author: " + getAuthor());
        System.out.println("Date Published: " + getPublishDate());
        System.out.println("Dewey Decimal: " + getDecimal());
        System.out.println("Recommended for Children: " + getAgeAdvised());
        System.out.println("Availble in described video: " + getDescribed());

        return "--------------------------------------";

    }
}
