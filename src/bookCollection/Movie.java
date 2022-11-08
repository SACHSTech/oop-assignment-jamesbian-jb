package bookCollection;

public class Movie extends Media {

    private String ageAdvised;
    private boolean viewDescribed;

    public Movie(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, String ageRestrict, boolean hasDescribed) {

        super(theTitle, theGenre, theAuthor, publishDate, theDecimal);
        ageAdvised = ageRestrict;
        viewDescribed = hasDescribed;

    }

    public String getAgeAdvised() {
        return ageAdvised;

    }

    public boolean getDescribed() {
        return viewDescribed;

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
