package bookCollection;

public class videoGame extends Media{

    private boolean isStardew;

    public videoGame(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, boolean stardewCheck) {

        super(theTitle, theGenre, theAuthor, publishDate, theDecimal);
        isStardew = stardewCheck;

    }


    boolean getStardew() {
        return isStardew;
    }
    
    public String toString() {
        System.out.println("--------------------------------------");
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Author: " + getAuthor());
        System.out.println("Date Published: " + publishDate());
        System.out.println("Dewey Decimal: " + getDecimal());
        System.out.println("Is it the best game ever made: " + getStardew());

        return "--------------------------------------";
    }
    
}
 