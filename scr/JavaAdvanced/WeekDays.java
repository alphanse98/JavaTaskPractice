package JavaAdvanced;
import java.util.ArrayList;
import java.util.Scanner;

//Q3. Store name of weekdays in an array (starting from "Sunday" at 0 index).
//Ask day position from user and print day name.
//Handle array index out of bound exception and give proper message if user enters day index outside range (0-6).
public class WeekDays {
    public  static  void main(String[] args) throws ArrayIndexOutOfBoundsException {
        // Add days
        ArrayList<String> days = new ArrayList<String>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        // get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number between 0 to 6 for display a day : ");
        int index = scanner.nextInt();

        // validate user input
        if(index > 6 || index < 0){
            throw new ArrayIndexOutOfBoundsException(" invalid number Select the number between 0 to 6");
        }else{
            System.out.print("day name is = " + days.get(index));
        }
    }
}

class ArrayIndexOutOfBoundsException extends Exception{
public ArrayIndexOutOfBoundsException( String message){
    super(message);
}
}
