package oops_in_java;

public class One_displayNameAndAge
{
    public static One_displayNameAndAge person = new One_displayNameAndAge();

    //properties
    int age = 18;
    String name = "kumar";

    //method display name and age
    public static void displayNameAndAge(){
        System.out.println("person name is "+person.name+" and age is "+person.age);
    }

    public static void main(String[] args) {
        displayNameAndAge();
    }
}