package branching_and_looping;

public class NumberPattern
{
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 1; j--) {
                if (j > i) {
                    System.out.print(j);
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}