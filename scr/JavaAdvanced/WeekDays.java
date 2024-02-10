package JavaAdvanced;
import java.util.ArrayList;
import java.util.Scanner;
public class WeekDays {
    public  static  void main(String[] args) throws ArrayIndexOutOfBoundsException {
        ArrayList<String> days = new ArrayList<String>();
        days.add("Sunday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (0-6) to display a day : ");
        int index = scanner.nextInt();

        if(index > 6 || index < 0){
            System.out.print("error");
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
