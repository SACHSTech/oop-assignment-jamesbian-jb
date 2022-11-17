package bookCollection;

import java.io.IOException;
import java.io.*;
import bookCollection.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Library {
    List<Book> allBooks = new ArrayList<Book>();
    List<Movie> allMovies = new ArrayList<Movie>();
    List<Magazine> allMagazines = new ArrayList<Magazine>();
    List<videoGame> videoGames = new ArrayList<videoGame>();

    public List<Book> getListOfBooks() {
        return allBooks;
    }

    public List<Book> findBooksByAuthor(String author) {
        // TODO: search book list by author
        List<Book> authorBooks = new ArrayList<Book>();
        for (Book book: allBooks) {
            if (book.getAuthor().equals(author)) {
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }

    public List<Movie> findMoviesByAuthor(String author) {
        // TODO: search book list by author
        return allMovies;
    }

    public void addBook(Book book) {
        allBooks.add(book);
    }

    public void addMovie(Movie movie) {
        allMovies.add(movie);
    }

    public void addMagazine(Magazine magazine) {
        allMagazines.add(magazine);
    }

    // List<Media> newList = Stream.concat(allBooks.stream(),
    // allMovies.stream()).toList();
    // return allBooks;

    public static void main(String[] args) throws IOException {

        // Initializing Objects
        Book station_11 = new Book("Station 11", "Science Fiction", "Emily Mandel", 2014, 302, 20912, " ");
        Book wonder = new Book("Wonder", "Realistic", "R.J Palacio", 2012, 002, 19902, " ");
        Book king_Lear = new Book("King Lear", "Dramatic Play", "William Shakespeare", 1606, 891, 149991, " ");
        Book macBeth = new Book("Macbeth", "Dramatic Play", "William Shakespeare", 1606, 831, 212892, " ");
        Magazine maCleans = new Magazine("Maclean's Issue 138: Trudeau Midlife Crisis", "Non-Fiction",
                "Maclean Archives", 2020, 92, 1902, "Editorial", " ");
        Movie top_Gun = new Movie("Top Gun Maverick", "Action", "Ehren Kruger", 2022, 704, "13+", " ", true, 16094);
        Movie hunger_Games = new Movie("The Hunger Games", "Action", "Suzanne Collins", 2008, 733, "13+", " ", false,
                13014);
        videoGame stardew_Valley;
        videoGame shotgun_Chess;

        Library bomenaLibrary = new Library();
        bomenaLibrary.getListOfBooks();

        bomenaLibrary.addBook(station_11);
        bomenaLibrary.addBook(wonder);
        bomenaLibrary.addBook(king_Lear);
        bomenaLibrary.addBook(macBeth);
        bomenaLibrary.addMagazine(maCleans);
        bomenaLibrary.addMovie(top_Gun);
        bomenaLibrary.addMovie(hunger_Games);
        // bomenaLibrary.addvideoGame(stardew_Valley);
        // bomenaLibrary.addvideoGame(shotgun_Chess);

        // Initializing Input Variables
        String name;
        String surname;
        int action;
        String findTitle;
        String findGenre;
        String findAuthor;
        int findDate;
        String searchAuthor;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(" ");
        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Library");
        System.out.println(" ");
        System.out.println("Please create an account: ");
        // System.out.print("First Name: ");
        // name = input.readLine();
        // System.out.print("Last Name: ");
        // surname = input.readLine();
        // System.out.println("Hello, " + name + " " + surname);

        while (true) {

            System.out.println("Please type the corresponding number to the action you would like to do. ");
            System.out.println("1 - Open Library Catalogue ");
            System.out.println("2 - Reccommend a Media ");
            System.out.println("3 - Review a Media");
            action = Integer.parseInt(input.readLine());

            switch (action) {

                case 1:
                    List<Book> allBooks = bomenaLibrary.getListOfBooks();
                    System.out.println(allBooks);
                    break;
                case 2:

                    System.out.println("Enter book Name: ");
                    findTitle = input.readLine();
                    System.out.println("Enter the genre of the book: ");
                    findGenre = input.readLine();
                    System.out.println("Enter publish date: ");
                    findAuthor = input.readLine();
                    System.out.println("Enter the genre of the book: ");
                    findDate = Integer.parseInt(input.readLine());

                    Book newBook = new Book(findTitle, findGenre, findAuthor, findDate, 0, 0, " ");
                    break;
                case 3:
                    System.out.println("Enter Author name: ");
                    searchAuthor = input.readLine();
                    List<Book> authorBooks = bomenaLibrary.findBooksByAuthor(searchAuthor);
                    // newBook.setPersonalReview("a");
                    break;

            }

        }
    }
}
