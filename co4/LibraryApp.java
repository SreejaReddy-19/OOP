import java.util.*;
import java.util.stream.Collectors;

class Book {
    String title;
    String author;
    double price;
    double rating;

    Book(String title, String author, double price, double rating) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.rating = rating;
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Java Basics", "John", 499.0, 4.5),
            new Book("Spring Boot", "Jane", 699.0, 4.2),
            new Book("Data Structures", "Alan", 399.0, 3.8),
            new Book("AI in Java", "Sreeja", 799.0, 4.8)
        );

        List<String> titles = books.stream()
            .filter(book -> book.rating > 4.0)
            .sorted(Comparator.comparingDouble(book -> book.price))
            .map(book -> book.title)
            .collect(Collectors.toList());

        titles.forEach(System.out::println);
    }
}
