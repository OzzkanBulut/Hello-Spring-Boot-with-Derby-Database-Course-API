package com.startup.courseapidata.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TopicRepository extends CrudRepository<Topic, Integer> { // Give the repository my entity and entity id generics


    // Repository will be interface because Spring Data JPA is gonna provide the clas.
    // This interface will use this implementation that comes with Spring Data JPA.
    // In Spring Data JPA they already have an interface that does all the CRUD operations.
    // All we have to do is create an interface and extend it to CrudRepository which is ready for us





}
