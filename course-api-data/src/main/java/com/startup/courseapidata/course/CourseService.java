package com.startup.courseapidata.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // This class is a business service
public class CourseService {

    @Autowired
    // When spring creates an instance of topicService,its gonna inject an instance of the TopicRepository to it .
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(int topicId) {

        List<Course> courses = new ArrayList<>();
        courseRepository.findAllBytopicId(topicId).forEach(courses::add);
        return courses;
    }



    public Course getCourse(int id) {
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
        // Save method in repository can be used for adding and updating data.
        // If data does not exist in the table save method creates it , if it exist save method updates it.
    }

    public void deleteCourse(Course course, int id) {
        courseRepository.deleteById(id);
    }

}

