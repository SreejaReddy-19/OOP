import java.util.*;
import java.util.stream.*;

public class StudentGrading {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(45, 72, 88, 59, 91, 63);

        List<String> grades = scores.stream()
            .filter(score -> score > 60) 
            .map(score -> {
                if (score >= 85) return "A";
                else if (score >= 70) return "B";
                else return "C";
            })
            .collect(Collectors.toList());

        System.out.println("Grades of students scoring above 60%:");
        grades.forEach(System.out::println);
    }
}
