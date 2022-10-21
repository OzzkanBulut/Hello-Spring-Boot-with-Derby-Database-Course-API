package com.startup.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    private final TopicService topicService;

    @Autowired // Declares the dependency
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    // Map any request which is a GET on /topics
    @RequestMapping(path = "/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();


        // Because we annotated this class RestController, whatever we return will be converted to JSON format
        // and sent back as HTTP RESPONSE.
        // The list will be in a JSON format when we go to /topics url.

        // The generated JSON has key names corresponding to property names of the Topic class.
        // The JSON values are the values of those properties.

        // In a real world this will be not a list , but a database.

        // GET /topics        --> Gets all topics
        // GET /topics/id     --> Gets the specific topic
        // POST /topics       --> Create new topic
        // PUT /topics/id     --> Updates the topic
        // DELETE /topics/id  --> Deletes the topic
    }


    @RequestMapping(path = "/topics/{id}")
    public Topic getTopic(@PathVariable int id) {
        return topicService.getTopic(id);
    }

    // This method will work when the request is POST
    @RequestMapping(method = RequestMethod.POST, value="/topics") // We specified the method to work only in POST request
    public void addTopic(@RequestBody Topic topic){ // Pick this instance from the request body --> We passed that JSON as a request body
        // it tells spring mvc that my request payload is gonna contain a JSON representation of this Topic instance.
        // I am asking to take that request body and convert it into a topic instance and pass it into a addTopic
        // when this url is mapped anyway.So I`m gonna get an instance of the topic that is already for me to add to the list.
        topicService.addTopic(topic);

    }

    // This is the same with POST method, but because of we update a single topic , we need a topic id.
    // We tell the put method our value will be in a /topics/{id} url with @PathVariable annotation
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable int id){
        topicService.updateTopic(topic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value ="topics/{id}")
    public void deleteTopic(@RequestBody Topic topic,@PathVariable int id){
        topicService.deleteTopic(topic,id);
    }
}
