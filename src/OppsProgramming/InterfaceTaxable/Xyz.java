package OppsProgramming.InterfaceTaxable;

public class Xyz {
    public static void main(String[] args) {

        Product ProductObj = new Product(1,50,7);
        ProductObj.calcTax();

        Employee EmployeeObj = new Employee(1,"Alphanse",700000);
        EmployeeObj.calcTax();

    }
}
