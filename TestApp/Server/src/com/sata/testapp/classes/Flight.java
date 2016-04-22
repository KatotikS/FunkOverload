package com.sata.testapp.classes;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kaotiks on 12/04/16.
 */
 
public class Flight implements Serializable {
    // Attributes
    private static final long serialVersionUID = 1L;
    private Date takeOffDate = null;
    private Date landDate = null;
    //private List<Airport> flightPath;
    private int id;
    public String airline;
    private Airport from;
    private Airport to;
    
    // Constructor
    public Flight(){}

    public String toString(){
        return "Airline: In progress ..\n" +
                "From: " + this.from + "\n" +
                "To: " + this.to + "\n"
                ;
    }

    // Setup Airports
    public void setupAirports(Airport aFrom, Airport aTo){
        this.from = aFrom;
        this.to = aTo;
    }

    // Airport From
    public Airport getFrom() {
        return from;
    }
    public void setFrom(Airport from) {
        this.from = from;
    }

    // Airport To
    public Airport getTo() {
        return to;
    }
    public void setTo(Airport to) {
        this.to = to;
    }
}
