package com.company;

public class Main {

//    (The Person, Student, Employee, Faculty, and Staff classes) Design a
//    class named Person and its two subclasses named Student and Employee.

//    Make Faculty and Staff subclasses of Employee. A person has a name,
//    address, phone number, and email address. A student has a class status (freshman,
//    sophomore, junior, or senior). Define the status as a constant. An employee has
//    an office, salary, and date hired. Use the MyDate class defined in Programming
//            Exercise 10.14 to create an object for date hired. A faculty member has office
//    hours and a rank. A staff member has a title. Override the toString method in
//    each class to display the class name and the person’s name.
//    Draw the UML diagram for the classes and implement them.
//    Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and
//    invokes their toString() methods.

    public static void main(String[] args) {

        Person person = new Person("Ivo","Burgas","087572952","ivo@gmai.com");

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        Student student = new Student("Kris","Obelq","52425","kga@gmail.com",2);
        System.out.println(student.toString());

        System.out.println("+++++++++++++++++++++++++++++++++++++");

        Employee employee = new Employee("Valio","Luiln","425624","vali@gag.com",
                "My Office",3500);
        System.out.println(employee.toString());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++=");

        Faculty faculty = new Faculty("My Faculty","Varna","+35623582",
                "myfaculty@gmai.com","Room 2",2500,8,"Lector");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        Staff staff = new Staff("Gosho","Yambol","252562",
                               "gosho52@gmai.com","My Office",2500,"Proffesor");


    }
}