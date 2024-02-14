package JavaAdvanced;
//Q2. Create a class Voter(voterId, name, age) with parameterized constructor.
//The parameterized constructor should throw a checked exception if age is less than 18.
//The message of exception is "invalid age for voter "
public class Voter {
    public static void main(String[] args) throws AgeNotWithinRangeException {
        // Creating a Voter object
        Voter voter = new Voter (1, "John Doe", 19);
        Voter voter2 = new Voter (2, "ram", 10);

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

//case 1<---------------------------------------------------->

//(input)
//Voter (1, "John Doe", 10)

//(out put)
// Voter ID : 1
//Name : John Doe
//Age: 19

//case 2 <---------------------------------------------------->

//(input)
//Voter (2, "ram", 10)

//(out put)
//" Invalid age for voter"
