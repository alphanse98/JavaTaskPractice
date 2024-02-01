public class Trhee_smallestNumber
{
    public static void main(String[] args) {
        smallestNumber(1,5,8);
    }

    //method find smallestNumber
    public static void smallestNumber(int a,int b, int c){
        if(c>a && b>a){
            System.out.print(a + " a is Smallest Number");
        }else if(c>b && a>b){
            System.out.print(b + " b is Smallest Number");
        }else{
            System.out.print(c + " c is Smallest Number");
        }
    }
}
