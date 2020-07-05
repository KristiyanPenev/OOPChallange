package com.company;

public class Faculty extends Employee {

    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String telephoneNumber, String emailAddress,
                   String office, double salary,int officeHours, String rank) {
        super(name, address, telephoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    /**
     *
     * @return office hours of the Faculty
     */
    public int getOfficeHours(){
        return officeHours;
    }

    /**
     *
     * @return rank of the Faculty
     */
    public String getRank(){
        return rank;
    }

    /**
     * Set office Hours of the Faculty
     * @param
     */

    public void setOfficeHours(int officeHours){
        this.officeHours = officeHours;
    }

    /**
     * Set rank of the Faculty
     * @param rank
     */
    public void setRank(String rank){
        this.rank = rank;
    }


    @Override
    public String toString() {
        return super.toString() + "\nOffice Hours = " + officeHours + "\nRank = " + rank;
    }


}
