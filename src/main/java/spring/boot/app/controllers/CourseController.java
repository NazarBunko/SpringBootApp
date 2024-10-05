package spring.boot.app.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.app.Course;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn DewOps", "in28minutes"),
                new Course(3, "Learn Web", "in28minutes")
        );
    }
}
