package com.company;

public class Staff extends Employee {

    private String title;
    public Staff(String name, String address, String telephoneNumber,
                 String emailAddress, String office, double salary,
                 String title) {
        super(name, address, telephoneNumber, emailAddress, office, salary);
        this.title = title;
    }

    /**
     *
     * @return title of the Staff
     */

    public String getTitle(){
        return title;
    }

    /**
     * Set new title of the Staff
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTitle = " + title;
    }
}
