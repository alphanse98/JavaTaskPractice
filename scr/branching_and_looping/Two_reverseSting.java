package branching_and_looping;

public class Two_reverseSting
{
    public static void main(String[] args) {
        reverseSting("hello");
    }

    public static void reverseSting(String StringValue){
        int srtLength = StringValue.length();
        StringBuilder revers = new StringBuilder();
        
        for(int i = srtLength-1 ; i >= 0 ; i--){
            revers.append(StringValue.charAt(i));
        }
        System.out.print(revers);
    }
}
