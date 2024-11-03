package com.stream.app.parcialspringbootc2.services;

import com.stream.app.parcialspringbootc2.entities.Course;
import com.stream.app.parcialspringbootc2.services.Impl.CourseServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class CourseServiceTest {

    @Autowired
    CourseServiceImpl courseService;

    @Test
    void getCourse(){
        Course course = courseService.getCourse();
        System.out.println(course.getTitle());
    }
}
