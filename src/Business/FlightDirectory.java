/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mitka
 */
public class FlightDirectory {
    
    private ArrayList<Flight> flightdirec;
    
    public FlightDirectory(){
        flightdirec = new ArrayList<>();
        
    }

    public ArrayList<Flight> getFlightdirec() {
        return flightdirec;
    }
    
    public Flight addFlight(){
        Flight fly = new Flight();
        flightdirec.add(fly);
        return fly;
    }
    
    public void removeFlight(Flight fly){
        flightdirec.remove(fly);
    }
    
    public Flight searchFlight(String num, String departure, String arrival){
        for(Flight fly: flightdirec){
            if(num.equals(fly.getAirplaneNum())){
                if (departure.equals(fly.getDepartureLocation())){
                    if(arrival.equals(fly.getArrivalLocation())){
                        return fly;
                    }   
                }                          
            }        
        }
        return null;
    } 
}
