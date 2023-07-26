import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();
//
//        Movie theMovie = Movie.getMovie("Comedy","Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
//        List list = new ArrayList<String>();
        while (true) { //while loop
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine(); //User's response
            if ("Qq".contains(type)) { //To test what the user entered
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
