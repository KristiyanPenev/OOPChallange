package com.company;

public class Employee extends Person {

    private String office;
    private double salary;
    private MyDate dateHired;


    public Employee(String name, String address, String telephoneNumber, String emailAddress,String office,double salary) {
        super(name, address, telephoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = new MyDate();
    }

    /** Return office */
    public String getOffice() {
        return office;
    }

    /** Return salary */
    public String getSalary() {
        return String.format("%.2f",salary);
    }

     public String getDateHired(){
        return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
     }

    /** Set new office */
    public void setOffice(String office) {
        this.office = office;
    }

    /** Set new salary */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(){
        dateHired = new MyDate();
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice = " + getOffice() + "\nSalary = " + getSalary() +
                "\nDate Hired = " + getDateHired();
    }

}
