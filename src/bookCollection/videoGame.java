package bookCollection;

public class videoGame extends Media {

    private boolean isStardew;

    public videoGame(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, String yourReview, boolean stardewCheck, int fame) {

        super(theTitle, theGenre, theAuthor, publishDate, theDecimal, fame, yourReview);
        isStardew = stardewCheck;

    }


    boolean getStardew() {
        return isStardew;
    }

    public int overallFame() {
        return (getBorrowed()/getPublishDate());
    }
    
    public String toString() {
        System.out.println("--------------------------------------");
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Author: " + getAuthor());
        System.out.println("Date Published: " + getPublishDate());
        System.out.println("Dewey Decimal: " + getDecimal());
        System.out.println("Is stardew: " + getStardew());
        System.out.println("Overall popularity: " + overallFame());
        return "--------------------------------------";
    }
    
}
 