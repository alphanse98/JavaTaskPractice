package OppsProgramming.InterfaceTaxable;

//2.Create Interface Taxable with members salesTax=7% and income Tax=10.5%. create abstract method calc Tax().
//a. Create class Employee(empId,name,salary) and implement Taxable to calculate income Tax on yearly salary.
//b. Create class Product(pid,price,quantity) and implement Taxable to calculate sales Tax on unit price of product.
//c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively

// Interface Taxable
interface Taxable {
    double salesTax = 0.07; // 7%
    double incomeTax = 0.105; // 10.5%

    // Abstract method calcTax()
    void calcTax();
}


