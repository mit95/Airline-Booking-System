/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author mitka
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private String contactNo;
    private String emailId;
    
    //binding booking with customer
    private String cust_airplaneType;
    private String cust_airplaneNum;
    private String cust_departureLocation;
    private String cust_arrivalLocation;
    private String cust_scheduledate;
    private int cust_airplaneSeats;
    private String cust_timeOfDay;
    private String cust_airlineName;

    public String getCust_airlineName() {
        return cust_airlineName;
    }

    public void setCust_airlineName(String cust_airlineName) {
        this.cust_airlineName = cust_airlineName;
    }
    
    

    public String getCust_airplaneType() {
        return cust_airplaneType;
    }

    public void setCust_airplaneType(String cust_airplaneType) {
        this.cust_airplaneType = cust_airplaneType;
    }

    public String getCust_airplaneNum() {
        return cust_airplaneNum;
    }

    public void setCust_airplaneNum(String cust_airplaneNum) {
        this.cust_airplaneNum = cust_airplaneNum;
    }

    public String getCust_departureLocation() {
        return cust_departureLocation;
    }

    public void setCust_departureLocation(String cust_departureLocation) {
        this.cust_departureLocation = cust_departureLocation;
    }

    public String getCust_arrivalLocation() {
        return cust_arrivalLocation;
    }

    public void setCust_arrivalLocation(String cust_arrivalLocation) {
        this.cust_arrivalLocation = cust_arrivalLocation;
    }

    public String getCust_scheduledate() {
        return cust_scheduledate;
    }

    public void setCust_scheduledate(String cust_scheduledate) {
        this.cust_scheduledate = cust_scheduledate;
    }

    public int getCust_airplaneSeats() {
        return cust_airplaneSeats;
    }

    public void setCust_airplaneSeats(int cust_airplaneSeats) {
        this.cust_airplaneSeats = cust_airplaneSeats;
    }

    public String getCust_timeOfDay() {
        return cust_timeOfDay;
    }

    public void setCust_timeOfDay(String cust_timeOfDay) {
        this.cust_timeOfDay = cust_timeOfDay;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
     @Override
    public String toString() {
        return firstName;
    }
    
    
}
