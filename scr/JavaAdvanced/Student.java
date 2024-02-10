package JavaAdvanced;

//Q1. Ramesh is developing a student management system for a university. In this system, you have a Student class to represent student information.
// You are asked to help Ramesh to handle exception which can be occurred into program
//according to following Scenarios:
// class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor.
//• If the age of the student is not between 15 and 21 then generate a user-defined exception "AgeNotWithinRangeException".
//If a name contains numbers or special symbols, raise exception "NameNotValidException". Define the two exception classes.
public class Student {
    public  static  void main(String[] args) throws AgeNotWithinRangeException {
        Student obj = new Student(1,"alphanse",20);
    }
    int rollNo;
    String name;
    int age;

    public  Student(int rollNo, String name, int age) throws AgeNotWithinRangeException {

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
        }

//        if (!isValidName(name)) {
//            throw new NameNotValidException("Name should not contain numbers or special symbols");
//        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        System.out.println("working");
    }
}

class  AgeNotWithinRangeException extends Exception{
    public AgeNotWithinRangeException( String message){
        super(message);
    }
}

class  NameNotValidException  extends Exception{
    public NameNotValidException ( String message){
        super(message);
    }
}

//public boolean isValidName(String name) {
//
//    return name.matches("[a-zA-Z\\s]+"); // Using regular expression to check if name contains only alphabets and spaces
//}







