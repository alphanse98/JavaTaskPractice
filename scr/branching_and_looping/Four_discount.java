public class Four_discount
{
    public static void main(String[] args) {
        discount(1100);
    }

    public static void discount(int amount){

        if(amount > 500){ // amount is > 500 applly 10% discount
            int discountPercentage = 10;
            if(amount > 1000) discountPercentage = 20 ; // amount is > 1000 applly 20% discount
            int discountAmount = (int) ((discountPercentage / 100.0) * amount);
            int finalAmount = amount - discountAmount;
            System.out.print(finalAmount);
        }else{
            System.out.print(amount + "test");
        }
    }
}