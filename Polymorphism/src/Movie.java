public class Movie {
    private String title;
    public Movie(String title) {
        this.title = title;
    }
    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) { //Make it uppercase and get just the first letter
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

}
class Adventure extends Movie {
    public Adventure(String title){
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
        "Pleasant Scene",
        "Scary music",
        "Something bad happen");
    }
    public void watchAdventure() {
        System.out.println("Watching an Adventure!");
    }
}
class Comedy extends Movie {
    public Comedy(String title){
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy ending");
    }
    public void watchComedy() {
        System.out.println("Watching a Comedy!");
    }
}
class ScienceFiction extends Movie {
    public ScienceFiction(String title){
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "ฺBad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }
    public void watchScienceFiction() {
        System.out.println("Watching a Science Fiction Thriller!");
    }
}