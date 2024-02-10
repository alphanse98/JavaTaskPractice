package JavaAdvanced;

public class Voter {
    public static void main(String[] args) throws AgeNotWithinRangeException {
        // Creating a Voter object
        Voter voter = new Voter (1, "John Doe", 10);

        // Printing details of the voter
        System.out.println("Voter ID: " + voter.voterId);
        System.out.println("Name: " + voter.name);
        System.out.println("Age: " + voter.age);
    }
    int voterId;
    String name;
    int age;

    // Constructor to initialize voterId, name, and age
    public Voter(int voterId, String name, int age) throws AgeNotWithinRangeException {
        if(age < 18){
            throw new AgeNotWithinRangeException(" Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}
