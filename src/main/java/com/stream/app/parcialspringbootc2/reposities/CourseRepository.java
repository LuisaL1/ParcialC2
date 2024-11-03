package com.stream.app.parcialspringbootc2.reposities;

import com.stream.app.parcialspringbootc2.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CourseRepository extends JpaRepository<Course, Long> {

}


