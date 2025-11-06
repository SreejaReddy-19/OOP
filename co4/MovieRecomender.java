import java.util.*;
import java.util.stream.Collectors;

class Movie {
    String title;
    int releaseYear;
    double rating;

    Movie(String title, int releaseYear, double rating) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }
}

public class MovieRecommender {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Inception", 2010, 4.8),
            new Movie("Interstellar", 2014, 4.6),
            new Movie("Tenet", 2020, 3.9),
            new Movie("Oppenheimer", 2023, 4.7)
        );

        List<String> recommendedTitles = movies.stream()
            .filter(movie -> movie.rating > 4.0)
            .sorted(Comparator.comparingInt(Movie::getReleaseYear).reversed())
            .map(movie -> movie.title)
            .collect(Collectors.toList());

        recommendedTitles.forEach(System.out::println);
    }
}
