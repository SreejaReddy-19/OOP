import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class EmployeeGrouping {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Charlie", "HR"),
            new Employee("David", "Finance"),
            new Employee("Eve", "IT")
        );

        Map<String, Long> departmentCounts = employees.stream()
            .collect(Collectors.groupingBy(
                emp -> emp.department,
                Collectors.counting()
            ));

        departmentCounts.forEach((dept, count) ->
            System.out.println(dept + ": " + count + " employees")
        );
    }
}
