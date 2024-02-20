package JavaAdvanced;
//Q4. Create a HashMap where keys are student names (strings) and values are their corresponding grades (integers).
//Create methods to add a new student, remove a student, and Display up a student's grade by name.

import java.util.HashMap;
public class HashMapStudent {
    static HashMap <String,Integer> StudentGradeList = new HashMap<String, Integer>();
    public static void main(String[] args) {
        // add Student list with grade
        addStudent("Alphanse",9);
        addStudent("Alice",7);

        //remove a student
        removeStudent("Alice");

        // Display up a student's grade by name.
        displayStudentGrade("Alphanse");
    }

    // Method to add a new student
    public static void addStudent(String name, int grade) {
        StudentGradeList.put(name, grade);
        System.out.println( name + " Student added ");
    }

    //remove a student
    public static  void removeStudent(String name){
        StudentGradeList.remove(name);
        System.out.println(name + " Student removed ");
    }

//    Display up a student's grade by name.
    public static void displayStudentGrade( String name){
        System.out.println(name +" Student grade is "+StudentGradeList.get(name));
    }
}

//output

//Alphanse Student added
//Alice Student added
//Alice Student removed
//Alphanse Student grade is 9
