package bookCollection;

public class videoGame extends Media {

    /**
     * Movie constructor
     * 
     * @param theTitle    Media Title
     * @param theGenre    Media Genre
     * @param theAuthor   Media Author
     * @param publishDate Publication Date of Media
     * @param theDecimal  Dewey Decimal of Genre
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
        return "--------------------------------------\n" +
                "Title: " + getTitle() + "\n" +
                "Genre: " + getGenre() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "Date Published: " + getPublishDate() + "\n" +
                "Dewey Decimal: " + getDecimal() + "\n" +
                "Is stardew: " + getStardew() + "\n";
    }
}
