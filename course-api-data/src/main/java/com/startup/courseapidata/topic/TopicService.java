package com.startup.courseapidata.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service // This class is a business service
public class TopicService {

    @Autowired
    // When spring creates an instance of topicService,its gonna inject an instance of the TopicRepository to it .
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {

        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(int id) {
        return topicRepository.findById(id).get();
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic, int id) {
        topicRepository.save(topic);
        // Save method in repository can be used for adding and updating data.
        // If data does not exist in the table save method creates it , if it exist save method updates it.
    }

    public void deleteTopic(Topic topic, int id) {
        topicRepository.deleteById(id);
    }

}

