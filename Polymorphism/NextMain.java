public class NextMain {
    
    public static void main(String[] args) {
        
        Movie movie = Movie.getMovie("A", "JAWS");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "JAWS");
        jaws.watchMovie();

        Object adventure = Movie.getMovie("A", "JAWS");
        Movie adventureMovie = (Movie) adventure;
        adventureMovie.watchMovie();

        Adventure adventureMovie2 = (Adventure) adventure;
        adventureMovie2.watchAdventure();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
