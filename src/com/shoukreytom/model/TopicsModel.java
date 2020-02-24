package com.shoukreytom.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class TopicsModel {

    private SimpleIntegerProperty id;
    private SimpleStringProperty from;
    private SimpleStringProperty to;
    private SimpleStringProperty topic;
    private SimpleStringProperty description;

    public TopicsModel(int id, String from, String to, String topic, String description) {
        this.id = new SimpleIntegerProperty(id);
        this.from = new SimpleStringProperty(from);
        this.to = new SimpleStringProperty(to);
        this.topic = new SimpleStringProperty(topic);
        this.description = new SimpleStringProperty(description);
    }

    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getFrom() {
        return from.get();
    }

    public SimpleStringProperty fromProperty() {
        return from;
    }

    public void setFrom(String from) {
        this.from.set(from);
    }

    public String getTo() {
        return to.get();
    }

    public SimpleStringProperty toProperty() {
        return to;
    }

    public void setTo(String to) {
        this.to.set(to);
    }

    public String getTopic() {
        return topic.get();
    }

    public SimpleStringProperty topicProperty() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic.set(topic);
    }

    public String getDescription() {
        return description.get();
    }

    public SimpleStringProperty descriptionProperty() {
        return description;
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    @Override
    public String toString() {
        return topic.get();
    }
}
