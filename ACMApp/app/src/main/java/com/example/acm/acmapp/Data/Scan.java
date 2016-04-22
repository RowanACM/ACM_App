package com.example.acm.acmapp.Data;

import java.util.Date;

/**
 * A scan item that has a guest id, location, and time scanned
 */
public class Scan {
    private String guestId = "unknown guest id";
    private String location = "unknown location";
    private String time = "unknown time";

    /**
     * Create a new scan
     * @param guestId The id of the user
     * @param location The location where the tag was scanned
     */
    public Scan(String guestId, String location){
        this.guestId = guestId;
        this.location = location;

        time = new Date().toString();
    }

    /**
     * Create a new scan
     * @param guestId The id of the user
     * @param location The location where the tag was scanned
     * @param time The time that the tag was scanned
     */
    public Scan(String guestId, String location, String time) {
        this.guestId = guestId;
        this.location = location;
        this.time = time;
    }

    /**
     * Set the time of the scan
     * @param time The new time scanner
     */
    public void setTime(String time) {
        this.time = time;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    /**
     * Set the location of scan
     * @param location Where the tag was scanned
     */
    public void setLocation(String location) {
        this.location=location;
    }

    public String getTime() {
        return time;
    }

    public String getGuestId() {
        return guestId;
    }

    public String getLocation() {
        return location;
    }

}
