package bookCollection;

public class Book extends Media {

    /**
     * Book constructor
     * 
     * @param theTitle    Media Title
     * @param theGenre    Media Genre
     * @param theAuthor   Media Author
     * @param publishDate Publication Date of Media
     * @param theDecimal  Unique Book ID
     * @param borrow      Times Borrowed
     * @param yourReview  User's Opinion of Media
     * @author J.Bian
     */

    public Book(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, int borrow,
            String yourReview) {
        super(theTitle, theGenre, theAuthor, publishDate, theDecimal, borrow, yourReview);

    }

    // Abstract
    public int overallFame() {
        return (getBorrowed() / getPublishDate());
    }

    // Returns all information of Book
    public String toString() {
        return super.toString();
    }
}
