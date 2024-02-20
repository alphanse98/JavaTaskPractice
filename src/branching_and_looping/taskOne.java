package branching_and_looping;

public class taskOne
{
    public static void main(String[] args) {
        check_positive_negative(-2);
    }
    
    public static void check_positive_negative(int num){
        if(num > 0){
            System.out.print(num + " is Povitive Number");
        }else{
            System.out.print(num + " is Negative Number");
        }
    }
}
