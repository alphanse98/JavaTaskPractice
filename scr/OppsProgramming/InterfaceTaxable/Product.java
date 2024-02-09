package OppsProgramming.InterfaceTaxable;

//b. Create class Product(pid,price,quantity) and i.

public class Product  implements Taxable{
    int pid;
    double price;
    int qauntityt;

       Product(int pid, double price, int qauntityt){
        this.pid = pid;
        this.price = price;
        this.qauntityt = qauntityt;
    }

    // Override calcTax() method to calculate income tax on yearly salary

@Override
    public void calcTax(){
        double salesTaxAmount = price * qauntityt * salesTax;
    System.out.println("sales tax is " + salesTaxAmount);
}
}
