package bookCollection;

public class videoGame extends Media {

    /**
     * Movie constructor
     * 
     * @param theTitle    Media Title
     * @param theGenre    Media Genre
     * @param theAuthor   Media Author
     * @param publishDate Publication Date of Media
     * @param theDecimal  Unique Video Game ID
     * @param borrow      Times Borrowed
     * @param yourReview  Publication Date of Media
     * @param isStardew   Checks if it is the best game in the world
     * @author J.Bian
     */

    private boolean isStardew;

    public videoGame(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal,
            String yourReview, boolean stardewCheck, int borrow) {

        super(theTitle, theGenre, theAuthor, publishDate, theDecimal, borrow, yourReview);
        isStardew = stardewCheck;

    }

    boolean getStardew() {
        return isStardew;
    }

    public int overallFame() {
        return (getBorrowed() / getPublishDate());
    }

    // Returns all information of videoGame
    public String toString() {
        return super.toString() +
                "Is stardew: " + getStardew() + "\n";
    }
}
