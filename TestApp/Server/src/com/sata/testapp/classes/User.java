package com.sata.testapp.classes;

import java.io.Serializable;

/**
 * Created by kaotiks on 11/04/16.
 */
 
public class User implements Serializable {
    // Attributes
    private static final long serialVersionUID = 1L;
    private static User instance = null;
    private double lat;
    private double lon;
    private String city;
    private String state;
    private String country;

    // Private constructor for Singleton
    private User() {
    }

    // Method for User creation (allow just one instance of User across the app)
    public static User createUser(){
        if(instance == null) {
            instance = new User();
            return instance;
        } else {
            System.out.println("User already created");
            return null;
        }
    }
    
    // Getters
    public double getLat() {
        return this.lat;
    }
    public double getLon() {
        return this.lon;
    }
    public String getLatString() {
        return "Latitude: " + this.lat + "\n";
    }
    public String getLonString() {
        return "Longitude: " + this.lon + "\n";
    }
    public String getCity(){
        return this.city;
    }

    public String toString(){
        return "I'm a user";
    }
}
