package Final_Project;

import java.util.ArrayList;
import java.util.List;

public class MovieDatabase {
    private List <Movie> movies;

    public MovieDatabase() {
        this.movies = new ArrayList<>();
    }
    public void addMovie (Movie movie) {
        if (!movies.contains(movie)) {
            movies.add(movie);
        }
    }
    public void removeMovie (Movie movie) {
        movies.remove(movie);
    }
    
    
}
