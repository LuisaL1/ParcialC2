package com.stream.app.parcialspringbootc2.services.Impl;

import com.stream.app.parcialspringbootc2.entities.Course;
import com.stream.app.parcialspringbootc2.reposities.CourseRepository;
import com.stream.app.parcialspringbootc2.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course getCourse() {
        // Como solo hay 1 serie en la tabla, se obtiene la primera posición de la lista
        List<Course> courseList = courseRepository.findAll();
        return courseList.get(0);
    }
}

