package javastream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1. Write a program using map() method,to convert a list of Strings into uppercase.
// If the //given List is: Stream names = Stream.of("abc", "d", "ef");
public class uppercase {
    public static void main(String[] args) {
        // Create a stream of strings
        Stream<String> names = Stream.of("abc", "d", "ef");

        // Use map to apply a lambda function to each element in the stream,
        // converting each string to uppercase
        List<String> uppercaseNames = names.map(element -> element.toUpperCase()).collect(Collectors.toList());

        // Print the list of uppercase strings
        System.out.println(uppercaseNames);
    }
}

// out put
// [ABC, D, EF]

