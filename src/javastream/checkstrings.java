package javastream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 2. Write a program to check whether the Strings in the List are empty or not and print
// the list having non-empty strings. If the given List is:
// Liststrings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl")
public class checkstrings
{
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter out the non-empty strings
        List<String> nonEmptyStrings  = strings.stream().filter(element -> !element.equals("")).collect(Collectors.toList());

        // Print the list of non-empty strings
        System.out.println("List of non-empty strings: " + nonEmptyStrings);
    }
}

// out put
// List of non-empty strings: [abc, bc, efg, abcd, jkl]




