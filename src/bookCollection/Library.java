package bookCollection;

import java.io.IOException;
import java.io.*;
import bookCollection.*;
import java.util.ArrayList;

public class Library {
    
    public static void main(String[] args) throws IOException {

        // Initializing Objects
        Book station_11 = new Book("Station 11", "Science Fiction", "Emily Mandel", 2014, 302, 20912, " ");
        Book wonder = new Book("Wonder", "Realistic", "R.J Palacio", 2012, 002, 19902, " ");
        Book king_Lear = new Book("King Lear", "Dramatic Play", "William Shakespeare", 1606 , 891, 149991, " ");
        Book macBeth = new Book("Macbeth", "Dramatic Play", "William Shakespeare", 1606 , 831, 212892, " ");
        Magazine maCleans = new Magazine("Maclean's Issue 138: Trudeau Midlife Crisis", "Non-Fiction","Maclean Archives" , 2020, 92, 1902, "Editorial", " ");
        Movie top_Gun = new Movie("Top Gun Maverick", "Action", "Ehren Kruger", 2022, 704, "13+", " ", true, 16094);
        Movie hunger_Games =  new Movie("The Hunger Games", "Action", "Suzanne Collins", 2008, 733, "13+", " ", false, 13014);
        videoGame stardew_Valley;
        videoGame shotgun_Chess;

        Library bomenaLibrary = new Library();
        bomenaLibrary.addBook(station_11);
        bomenaLibrary.addBook(wonder);
        bomenaLibrary.addBook(king_Lear);
        bomenaLibrary.addBook(macBeth);
        bomenaLibrary.addMagazine(maCleans);
        bomenaLibrary.addMovie(top_Gun);
        bomenaLibrary.addMovie(hunger_Games);
        bomenaLibrary.addvideoGame(stardew_Valley);
        bomenaLibrary.addvideoGame(shotgun_Chess);

        //Initializing Input Variables
        String name;
        String surname;
        String action;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


        
        System.out.print(" ");
        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Library");
        System.out.println(" ");
        System.out.println("Please create an account: ");
        System.out.print("First Name: ");
        name = input.readLine();
        System.out.print("Last Name: ");
        surname = input.readLine();
        System.out.println("Hello, " + name + " "+ surname);
        System.out.println("Please type the corresponding number to the action you would like to do. ");
        action = input.readLine();


        
    

        

    }
}
