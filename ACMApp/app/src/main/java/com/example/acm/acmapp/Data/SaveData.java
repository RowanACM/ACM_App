package com.example.acm.acmapp.Data;


import java.io.Serializable;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Information that is saved when the activity is closed
 * Saves the current location, server serverPassword, and a list of pending taps
 */
public class SaveData implements Serializable{
    private static String currentLocation = "Unknown";
    private static Queue<Scan> scans = new LinkedList<>();
    private static String serverPassword = "-1";

    public SaveData() {

    }

    public static void setServerPassword(String pass){
        serverPassword = pass;
    }
    public static String getServerPassword(){
        return serverPassword;
    }
    public void setCurrentLocation(String loc){
        currentLocation = loc;
    }
    public String getCurrentLocation(){
        return currentLocation;
    }
    public static boolean add(Scan s){
        return scans.add(s);
    }
    public static Scan peek(){
        return scans.peek();
    }
    public static Scan  remove(){
        return scans.remove();
    }
    public static int getSize(){
        return scans.size();
    }

}