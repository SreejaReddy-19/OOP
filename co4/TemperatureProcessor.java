import java.util.*;
import java.util.stream.*;

public class TemperatureProcessor {
    public static void main(String[] args) {
        List<Double> celsiusTemps = Arrays.asList(25.0, 31.5, 29.0, 35.2, 28.3, 33.0);

        List<Double> hotFahrenheitTemps = celsiusTemps.stream()
            .filter(c -> c > 30.0) 
            .map(c -> (c * 9 / 5) + 32) 
            .collect(Collectors.toList());

        System.out.println("Temperatures above 30°C in Fahrenheit:");
        hotFahrenheitTemps.forEach(System.out::println);
    }
}
