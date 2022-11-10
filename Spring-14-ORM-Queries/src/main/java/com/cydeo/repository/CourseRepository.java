package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {

    List<Course> findByCategory(String category);

    //findAll courses by category and order the entities by name
    List<Course> findByCategoryOrderByName (String category);

    //checks if a course with the provided name exists. return true if course exists, false otherwise
    boolean existsByName(String name);
    int countByCategory(String category);
    List<Course> findByNameStartingWith(String name);
    //Stream<Course> streamByCategory(String category);

}
