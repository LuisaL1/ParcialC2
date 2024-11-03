package com.stream.app.parcialspringbootc2.controllers;

import com.stream.app.parcialspringbootc2.entities.Course;
import com.stream.app.parcialspringbootc2.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @GetMapping
    public Course getCourse() {
        return courseService.getCourse();
    }
}


