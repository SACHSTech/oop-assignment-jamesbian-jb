package bookCollection;

public class Movie extends Media {

    /**
     * Movie constructor
     * 
     * @param theTitle       Media Title
     * @param theGenre       Media Genre
     * @param theAuthor      Media Author
     * @param publishDate    Publication Date of Media
     * @param theDecimal     Unique Movie ID
     * @param borrow         Times Borrowed
     * @param yourReview     Publication Date of Media
     * @param ageAdvised     Age reccommendation of Movie
     * @param describedVideo Availbility of Described Video
     * @author J.Bian
     */

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

    // Returns all information of Movie
    public String toString() {
        return super.toString() +
                "Age Restriction: " + getAgeAdvised() + "\n" +
                "Described Video Availble: " + getDescribed() + "\n";
    }
}
