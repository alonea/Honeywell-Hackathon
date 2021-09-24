package com.hackathon.aerospacecart.aerocart.models;

public class TrackingInfo {
    private String trackingId;
    private Location location;
    private String trackingStatus;
    public String getTrackingId() {
        return trackingId;
    }
    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public String getTrackingStatus() {
        return trackingStatus;
    }
    public void setTrackingStatus(String trackingStatus) {
        this.trackingStatus = trackingStatus;
    }
    
}
