package com.example.Instructorapi.service;

import com.example.Instructorapi.dto.HealthResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class HealthService {
    public HealthResponseDTO checkHealth() {
        // Di sini boleh tambah logik semak DB atau disk space jika perlu
        return new HealthResponseDTO("OK", "System is up and running");
    }
}