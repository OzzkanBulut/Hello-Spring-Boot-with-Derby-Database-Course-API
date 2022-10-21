package com.startup.courseapidata.course;

import com.startup.courseapidata.topic.Topic;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
    Iterable<Course> findAllBytopicId(int topic_id);
    // Created an iterable that searches the list with topic id


    // Repository will be interface because Spring Data JPA is gonna provide the clas.
    // This interface will use this implementation that comes with Spring Data JPA.
    // In Spring Data JPA they already have an interface that does all the CRUD operations.
    // All we have to do is create an interface and extend it to CrudRepository which is ready for us





}
