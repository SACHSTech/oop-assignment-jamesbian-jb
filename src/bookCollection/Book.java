package bookCollection;

public class Book extends Media{

    private boolean isOnline;
    private int copiesAvailible;

    public Book(String theTitle, String theGenre, String theAuthor, int publishDate, double theDecimal, boolean hasOnline,int numCopies, int borrow) {
        super(theTitle, theGenre, theAuthor, publishDate, theDecimal, borrow);
        isOnline = hasOnline;
        copiesAvailible = numCopies;


    }

    public boolean getOnline() {
        return isOnline;

    }

    public int getCopies() {
        return copiesAvailible;

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

        return "--------------------------------------";
        
    }
    
}
