package com.example.Instructorapi.controller;

import com.example.Instructorapi.model.Instructor;
import com.example.Instructorapi.service.InstructorService;
import com.example.Instructorapi.dto.CreateInstructorRequest; // Pastikan import ini ada
import jakarta.validation.Valid; // Untuk validation
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }
    @GetMapping("/health")
    public String healthCheck() {
        return "API is running smoothly!";
    }

    @GetMapping
    public List<Instructor> getInstructors() {
        return instructorService.getAllInstructors();
    }

    @PostMapping
    public Instructor createInstructor(@Valid @RequestBody CreateInstructorRequest request) {
        Instructor newInstructor = new Instructor(
            request.getName(),
            request.getEmail(),
            request.getSpecialization(),
            request.getYearsExperience()
        );

        return instructorService.addInstructor(newInstructor);
    }
}