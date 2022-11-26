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

    // Method to concat all objects into Main
    public void intialize() {
        Book station_11 = new Book("Station 11", "Science Fiction", "Emily Mandel", 2014, 302, 20912, " ");
        Book wonder = new Book("Wonder", "Realistic", "R.J Palacio", 2012, 002, 19902, " ");
        Book king_Lear = new Book("King Lear", "Dramatic Play", "William Shakespeare", 1606, 891, 149991, " ");
        Book macBeth = new Book("Macbeth", "Dramatic Play", "William Shakespeare", 1606, 831, 212892, " ");
        Magazine maCleans = new Magazine("Maclean's Issue 138: Trudeau Midlife Crisis", "Non-Fiction",
                "Maclean Archives", 2020, 92, 1902, "Editorial", " ");
        Magazine vogue = new Magazine("Vogue Issue #129", "Non Fiction", "Vogue", 2012, 139.3, 3002, " ",
                " Entertainment Gossip ");
        Movie top_Gun = new Movie("Top Gun Maverick", "Action", "Ehren Kruger", 2022, 704, "13+", " ", true,
                16094);
        Movie hunger_Games = new Movie("The Hunger Games", "Action", "Suzanne Collins", 2008, 733, "13+", " ", false,
                13014);
        videoGame stardew_Valley = new videoGame("Stardew Valley", "Farming", "ConcernedApe", 2016, 803.3, " ", true,
                19200);
        videoGame shotgun_Chess = new videoGame("Shotgun Chess", "Action", "PUNKCAKE", 2022, 901.201, " ", false,
                120203);
        historicalText charter = new historicalText("Canadian Charter of Rights", "Non Fiction",
                "Pierre Elliot Trudeau", 1982, 49.7, 762, " ",
                " Human Rights ");

        // Adding objects into the main function
        addBook(station_11);
        addBook(wonder);
        addBook(king_Lear);
        addBook(macBeth);
        addMagazine(maCleans);
        addMagazine(vogue);
        addMovie(top_Gun);
        addMovie(hunger_Games);
        addvideoGame(stardew_Valley);
        addvideoGame(shotgun_Chess);
        historicalText(charter);
        getListOfMedias();
    }

    // allMedia becomes a complete Arraylist of all types of Objects
    public List<Media> getListOfMedias() {
        allMedia = Stream.concat(allBooks.stream(), allMovies.stream()).toList();
        allMedia = Stream.concat(allMedia.stream(), allMagazines.stream()).toList();
        allMedia = Stream.concat(allMedia.stream(), allVideoGames.stream()).toList();
        allMedia = Stream.concat(allMedia.stream(), allHistoricalText.stream()).toList();
        return allMedia;
    }

    // Find by author algorithm
    public List<Media> findAllByAuthor(String author) {
        for (Media media : allMedia) {
            if (media.getAuthor().equals(author)) {
                authorWorks.add(media);
            }
        }
        return authorWorks;
    }

    // Find by title algorithm
    public List<Media> findAllByTitle(String title) {
        for (Media media : allMedia) {
            if (media.getTitle().equals(title)) {
                titleMedia.add(media);
            }
        }
        return titleMedia;
    }

    // Search for the Unique ID of the Media
    public Media getByUniqueID(double uniqueID) {
        Media mediaFound = null;
        for (Media media : allMedia) {
            if (media.getDecimal() == uniqueID) {
                mediaFound = media;
                break;
            }
        }
        return mediaFound;
        
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

    public int getAction() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int action = -1;
        while (true) {
            try {

                System.out.println("Please type the corresponding number to the action you would like to do. ");
                System.out.println("1 - Open Main Catalogue ");
                System.out.println("2 - Add a new book ");
                System.out.println("3 - Review a Media");
                System.out.println("4 - Library statistics ");
                action = Integer.parseInt(input.readLine());

                if ((action == 1) || (action == 2) || (action == 3)) {
                    break;
                }

            } catch (Exception NumberFormatException) {
                System.out.println("Enter a valid answer.");
            }
        }
        return action;
    }

    public int getSearchType() {
        int searchType = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        // Determining a Search Method
        while (true) {
            try {
                System.out.println("Enter search method: ");
                System.out.println("1 - By Author ");
                System.out.println("2 - By Title ");
                System.out.println("3 - All Medias ");

                searchType = Integer.parseInt(input.readLine());

                if ((searchType == 1) || (searchType == 2) || (searchType == 3)) {
                    break;
                }

            } catch (Exception NumberFormatException) {
                System.out.println("Enter a valid answer.");
            }
        }
        return searchType;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        int action = -1;
        String findTitle;
        String findGenre;
        String findAuthor;
        int findDate;
        String searchAuthor;
        String searchTitle;
        int searchType;
        double searchID;
        String enterReview;

        Main bomenaMain = new Main();
        bomenaMain.intialize();

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" ");
        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Bomena Library");
        System.out.println("Logging into admin systems...");
        System.out.println("");
        TimeUnit.SECONDS.sleep(3);

        // Switchcase that allows user to choost between the options of functionality
        while (true) {
            action = bomenaMain.getAction();

            switch (action) {
                case 1:
                    searchType = bomenaMain.getSearchType();
                    switch (searchType) {

                        // Search by Author
                        case 1:
                            System.out.println("Enter Author name: ");
                            searchAuthor = input.readLine();
                            List<Media> authorMedia = bomenaMain.findAllByAuthor(searchAuthor);
                            for (Media media : authorMedia) {
                                System.out.println(media);
                            }
                            break;

                        // Search by Title
                        case 2:
                            System.out.println("Enter Title: ");
                            searchTitle = input.readLine();
                            List<Media> titleMedia = bomenaMain.findAllByTitle(searchTitle);
                            for (Media media : titleMedia) {
                                System.out.println(media);
                            }
                            break;

                        // List of all Availble Media
                        case 3:
                            List<Media> allMedias = bomenaMain.getListOfMedias();
                            for (Media media : allMedias) {
                                System.out.println(media);
                            }
                    }
                    break;

                // Adding a new book to the Catalogue
                case 2:
                    System.out.println("Enter book Name: ");
                    findTitle = input.readLine();
                    System.out.println("Enter the genre of the book: ");
                    findGenre = input.readLine();
                    System.out.println("Enter Author: ");
                    findAuthor = input.readLine();
                    System.out.println("Enter Publish Date: ");
                    findDate = Integer.parseInt(input.readLine());

                    Book newBook = new Book(findTitle, findGenre, findAuthor, findDate, 0, 0, " ");
                    bomenaMain.addBook(newBook);
                    bomenaMain.getListOfMedias();

                    break;
                // Leave a review on the book
                case 3:
                    System.out.println("Enter Unique ID of Media: ");
                    searchID = Double.parseDouble(input.readLine());
                    Media idMedia = bomenaMain.getByUniqueID(searchID);
                    System.out.println(idMedia);
                    System.out.println("Enter your review on the Book: ");
                    enterReview = input.readLine();
                    idMedia.setPersonalReview(enterReview);
                    bomenaMain.getListOfMedias();
                    break;

                // Statistics on the library
                case 4:
                    int numBooks = bomenaMain.getBookCount();
                    System.out.println("Total number of Books: " + numBooks);
                    System.out.println("Total types of Media: 5");
                    break;
            }
        }
    }
}
