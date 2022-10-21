package com.startup.courseapidata.course;

import com.startup.courseapidata.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    private final CourseService courseService;

    @Autowired // Declares the dependency
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // Map any request which is a GET on /topics/{id}/courses
    @RequestMapping(path = "/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable int topicId) {
        return courseService.getAllCourses(topicId);
    }


    @RequestMapping(path = "/topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable int id) {
        return courseService.getCourse(id);
    }


    @RequestMapping(method = RequestMethod.POST, value="/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable int topicId){

        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);

    }

    // This is the same with POST method, but because of we update a single topic , we need a topic id.
    // We tell the put method our value will be in a /topics/{id} url with @PathVariable annotation
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable int id, @PathVariable int topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value ="topics/{topicId}/courses/{id}")
    public void deleteTopic(@RequestBody Course course, @PathVariable int id){
        courseService.deleteCourse(course,id);
    }
}
