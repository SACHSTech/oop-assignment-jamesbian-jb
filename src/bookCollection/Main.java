package bookCollection;

import java.io.IOException;
import java.io.*;
import bookCollection.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.concurrent.TimeUnit;

public class Main {

    // Intializing Arraylists
    List<Book> allBooks = new ArrayList<Book>();
    List<Movie> allMovies = new ArrayList<Movie>();
    List<Magazine> allMagazines = new ArrayList<Magazine>();
    List<videoGame> allVideoGames = new ArrayList<videoGame>();
    List<historicalText> allHistoricalText = new ArrayList<historicalText>();
    List<Media> authorWorks = new ArrayList<Media>();
    List<Media> titleMedia = new ArrayList<Media>();
    List<Media> allMedia = new ArrayList<Media>();

    // allMedia becomes a complete Arraylist of all types of Objects
    public List<Media> getListOfMedias() {
        allMedia = Stream.concat(allBooks.stream(), allMovies.stream()).toList();
        allMedia = Stream.concat(allMedia.stream(), allMagazines.stream()).toList();
        allMedia = Stream.concat(allMedia.stream(), allVideoGames.stream()).toList();
        allMedia = Stream.concat(allMedia.stream(), allHistoricalText.stream()).toList();
        return allMedia;
    }

    public List<Media> findAllByAuthor(String author) {
        for (Media media : allMedia) {
            if (media.getAuthor().equals(author)) {
                authorWorks.add(media);
            }
        }
        return authorWorks;
    }

    public List<Media> findAllByTitle(String title) {
        for (Media media : allMedia) {
            if (media.getAuthor().equals(title)) {
                titleMedia.add(media);
            }
        }
        return titleMedia;
    }

    // Returns length of Arraylist
    public int getBookCount() {
        return allBooks.size();

    }

    // Intializing Methods to add Objects
    public void addBook(Book book) {
        allBooks.add(book);
    }

    public void addMovie(Movie movie) {
        allMovies.add(movie);
    }

    public void addMagazine(Magazine magazine) {
        allMagazines.add(magazine);
    }

    public void addvideoGame(videoGame videoGame) {
        allVideoGames.add(videoGame);
    }

    public void historicalText(historicalText historicalText) {
        allHistoricalText.add(historicalText);
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        // Initializing Objects
        Book station_11 = new Book("Station 11", "Science Fiction", "Emily Mandel", 2014, 302, 20912, " ");
        Book wonder = new Book("Wonder", "Realistic", "R.J Palacio", 2012, 002, 19902, " ");
        Book king_Lear = new Book("King Lear", "Dramatic Play", "William Shakespeare", 1606, 891, 149991, " ");
        Book macBeth = new Book("Macbeth", "Dramatic Play", "William Shakespeare", 1606, 831, 212892, " ");
        Magazine maCleans = new Magazine("Maclean's Issue 138: Trudeau Midlife Crisis", "Non-Fiction",
                "Maclean Archives", 2020, 92, 1902, "Editorial", " ");
        Magazine vogue = new Magazine("Vogue Issue #129", "Non Fiction", "Vogue", 2012, 139.3, 3002, " ",
                " Entertainment Gossip ");
        Movie top_Gun = new Movie("Top Gun Maverick", "Action", "William Shakespeare", 2022, 704, "13+", " ", true,
                16094);
        Movie hunger_Games = new Movie("The Hunger Games", "Action", "Suzanne Collins", 2008, 733, "13+", " ", false,
                13014);
        videoGame stardew_Valley = new videoGame("Stardew Valley", "Farming", "ConcernedApe", 2016, 803.3, " ", true,
                19200);
        videoGame shotgun_Chess = new videoGame("Shotgun Chess", "Action", "PUNKCAKE", 2022, 901.201, " ", false,
                120203);
        historicalText charter = new historicalText("Canadian Charter of Rights", "Non Fiction", "Pierre Elliot Trudeau", 1982, 49.7, 762, " ",
                " Entertainment Gossip ");
        Main bomenaMain = new Main();

        // Adding objects into the main function
        bomenaMain.addBook(station_11);
        bomenaMain.addBook(wonder);
        bomenaMain.addBook(king_Lear);
        bomenaMain.addBook(macBeth);
        bomenaMain.addMagazine(maCleans);
        bomenaMain.addMagazine(vogue);
        bomenaMain.addMovie(top_Gun);
        bomenaMain.addMovie(hunger_Games);
        bomenaMain.addvideoGame(stardew_Valley);
        bomenaMain.addvideoGame(shotgun_Chess);
        bomenaMain.historicalText(charter);
        bomenaMain.getListOfMedias();

        // Initializing Input Variables
        int action;
        String findTitle;
        String findGenre;
        String findAuthor;
        int findDate;
        String searchAuthor;
        String searchTitle;
        int searchType;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(" ");
        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Bomena Library");
        System.out.println("Logging into admin systems...");
        System.out.println("");
        TimeUnit.SECONDS.sleep(5);

        // Switchcase that allows user to
        while (true) {

            System.out.println("Please type the corresponding number to the action you would like to do. ");
            System.out.println("1 - Open Main Catalogue ");
            System.out.println("2 - Add a new book ");
            System.out.println("3 - Review a Media");
            System.out.println("4 - Library statistics ");
            action = Integer.parseInt(input.readLine());

            switch (action) {

                case 1:
                    // Determining a Search Method
                    try {
                        System.out.println("Enter search method: ");
                        System.out.println("1 - By Author ");
                        System.out.println("2 - By Title ");
                        System.out.println("3 - All Medias ");

                        searchType = Integer.parseInt(input.readLine());
                    } catch (Exception NumberFormatException) {
                        System.out.println("Enter a valid answer.");
                    } finally {
                        System.out.println("Enter search method: ");
                        System.out.println("1 - By Author ");
                        System.out.println("2 - By Title ");
                        System.out.println("3 - All Medias ");

                        searchType = Integer.parseInt(input.readLine());
                    }

                    switch (searchType) {

                        // Search by Author
                        case 1:
                            System.out.println("Enter Author name: ");
                            searchAuthor = input.readLine();
                            List<Media> authorMedia = bomenaMain.findAllByAuthor(searchAuthor);
                            System.out.println(authorMedia);
                            break;

                        // Search by Title
                        case 2:
                            System.out.println("Enter Title: ");
                            searchTitle = input.readLine();
                            List<Media> titleMedia = bomenaMain.findAllByTitle(searchTitle);
                            System.out.println(titleMedia);
                            break;

                        // List of all Availble Media
                        case 3:

                            List<Media> allMedias = bomenaMain.getListOfMedias();
                            int numBooks = bomenaMain.getBookCount();
                            System.out.println(numBooks + " in the Catalogue.");
                            System.out.println(allMedias);

                    }

                    break;
                case 2:

                    // Adding a new book to the Catalogue
                    System.out.println("Enter book Name: ");
                    findTitle = input.readLine();
                    System.out.println("Enter the genre of the book: ");
                    findGenre = input.readLine();
                    System.out.println("Enter publish date: ");
                    findAuthor = input.readLine();
                    System.out.println("Enter the genre of the book: ");
                    findDate = Integer.parseInt(input.readLine());

                    Book newBook = new Book(findTitle, findGenre, findAuthor, findDate, 0, 0, " ");
                    bomenaMain.addBook(newBook);
                    break;
                case 3:

                    // newBook.setPersonalReview("a");
                    break;
                case 4:
                    int numBooks = bomenaMain.getBookCount();
                    System.out.println("Total number of Books: " + numBooks);
                    System.out.println("Total types of Media: 5");
                    
                    break;

            }

        }
    }
}
