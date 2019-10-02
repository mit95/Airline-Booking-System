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
public class Airliner {
    
    private String name;
    private FlightDirectory flightDirectory;
    
    
    public Airliner(){
        flightDirectory = new FlightDirectory();
        
    
    }    
    
    public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     @Override
    public String toString() {
        return name;
    }
    
    
}
