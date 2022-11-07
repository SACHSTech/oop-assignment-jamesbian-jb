package bookCollection;

public class Movie extends Media {

    private String ageAdvised;

    public Movie(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, String ageRestrict) {

        super(theTitle, theGenre, theAuthor, publishDate, theDecimal);
        ageAdvised = ageRestrict;

    }

    public String getAgeAdvised() {
        return ageAdvised;

    }

    public String toString() {
        System.out.println("--------------------------------------");
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Author: " + getAuthor());
        System.out.println("Date Published: " + publishDate());
        System.out.println("Dewey Decimal: " + getDecimal());

        return "--------------------------------------";
    }
}
