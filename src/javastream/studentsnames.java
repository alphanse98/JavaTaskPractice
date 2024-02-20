package javastream;
import java.util.List;
import java.util.stream.Collectors;

// 3. You are a teacher in school .In your class there are 10 students, you have decided to give special gifts to those students whose
// names start with “A”.you are asked to separate those students with the help of a java program.
// Requirement:
// • Use List interface to store the student name
// • Use a lambda expression and the Stream API to filter the students

public class studentsnames
{
    public static void main(String[] args) {

        // Create an immutable list of student names
        List<String> studentNames = List.of("Alice", "Bob", "Alex", "David", "Andrew", "Emily", "Amy", "John", "Anna", "Adam");

        // Use Stream API and lambda expression to filter students whose names start with "A"
        List<String> studentsWithA = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Print the list of students whose names start with "A"
        System.out.println("Students whose names start with 'A': " + studentsWithA);
    }
}

// out put
// Students whose names start with 'A': [Alice, Alex, Andrew, Amy, Anna, Adam]

