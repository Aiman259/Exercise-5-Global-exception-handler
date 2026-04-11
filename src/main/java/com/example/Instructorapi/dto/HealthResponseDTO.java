package com.example.Instructorapi.dto;

public class HealthResponseDTO {
    private String status;
    private String message;

    public HealthResponseDTO(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() { return status; }
    public String getMessage() { return message; }
    
}
