package bookCollection;

public class Book extends Media{


    public Book(String theTitle, String theGenre, String theAuthor,int publishDate, double theDecimal, int borrow, String yourReview) {
        super(theTitle, theGenre, theAuthor, publishDate, theDecimal, borrow, yourReview);


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
