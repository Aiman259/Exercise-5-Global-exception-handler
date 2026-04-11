package com.example.Instructorapi.model;

public class HealthStatus {
    private String status;
    private String version;

    public HealthStatus(String status, String version) {
        this.status = status;
        this.version = version;
    }

    // Getters
    public String getStatus() { return status; }
    public String getVersion() { return version; }
}
    
