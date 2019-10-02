/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author mitka
 */
public class Flight {
    private String airplaneType;
    private String airplaneNum;
    private String departureLocation;
    private String arrivalLocation;
    private String scheduledate;
    private int airplaneSeats = 150;
    private String timeOfDay;
    
    public Flight(){
        
    }

    public String getScheduledate() {
        return scheduledate;
    }

    public void setScheduledate(String scheduledate) {
        this.scheduledate = scheduledate;
    }
    

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String getAirplaneNum() {
        return airplaneNum;
    }

    public void setAirplaneNum(String airplaneNum) {
        this.airplaneNum = airplaneNum;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public int getAirplaneSeats() {
        return airplaneSeats;
    }

    public void setAirplaneSeats(int airplaneSeats) {
        this.airplaneSeats = airplaneSeats;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
    
    public String toString() {
        return airplaneType;
    }
    
}
