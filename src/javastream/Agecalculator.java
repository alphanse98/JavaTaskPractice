package javastream;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//4. Rajesh has been given a task to create an app which takes the user's birthdate as input and calculates their age,
// you have to help him to build this app using the java.time.LocalDate class.
//Input:
//Enter your birthdate (yyyy-mm-dd): 1990-05-15
//Output:
//Your age is: 33 years, 4 months, and 13 days.

public class Agecalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birthdate
        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String birthdateStr = scanner.nextLine();

        // Parse the user input string to LocalDate object
        LocalDate birthdate = LocalDate.parse(birthdateStr);

        // Calculate the age
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);

        // Display the age
        System.out.printf("Your age is: %d years, %d months, and %d days.",
                age.getYears(), age.getMonths(), age.getDays());

        // Close the scanner
        scanner.close();
    }
}

//output
//Enter your birthdate (yyyy-mm-dd): 1998-08-16
//Your age is: 25 years, 6 months, and 4 days.