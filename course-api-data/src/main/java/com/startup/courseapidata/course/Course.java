package com.startup.courseapidata.course;


import com.startup.courseapidata.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Course { // Because of @Entity, JPA knows to create a table called Topic.
    // Topic table is gonna have 3 columns = id,name and description

    @Id // This variable will be primary key in the Topic table because we annotated it with @Id
    private int id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Course() {
    }

    public Course(int id, String name, String description, int topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
