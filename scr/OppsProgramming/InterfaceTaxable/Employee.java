package OppsProgramming.InterfaceTaxable;

public class Employee implements Taxable {

    int empId;
    String name;
    int salary;
     Employee(int empId, String name, int salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax(){
        double taxAmount = salary * incomeTax;
        System.out.print("salary tax is = "+ taxAmount);
    }

}
