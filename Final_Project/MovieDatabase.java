package Final_Project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
    public Movie getMovieDetails(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equals(title)) {
                return movie;
            }
        }
        return null;
    }
    
     public List<Movie> getAllMovies() {
        return movies;
    }

    // Advanced operations using Stream API and Lambda functions
    public List<Movie> getMoviesSortedByTitle() {
        return movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .collect(Collectors.toList());
    }

    public List<Movie> getMoviesFilteredByDirector(String director) {
        return movies.stream()
                .filter(movie -> movie.getDirector().equals(director))
                .collect(Collectors.toList());
    }

    public double getTotalRunningTime() {
        return movies.stream()
                .mapToDouble(Movie::getRunningTime)
                .sum();
    }
}
