package com.shoukreytom.model;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDate;

public class TopicsModel {

    private SimpleObjectProperty<LocalDate> from;
    private SimpleObjectProperty<LocalDate> to;
    private SimpleStringProperty topic;
    private SimpleStringProperty description;

    public TopicsModel(LocalDate from, LocalDate to, String topic, String description) {
        this.from = new SimpleObjectProperty<>(from);
        this.to = new SimpleObjectProperty<>(to);
        this.topic = new SimpleStringProperty(topic);
        this.description = new SimpleStringProperty(description);
    }

    public LocalDate getFrom() {
        return from.get();
    }

    public SimpleObjectProperty<LocalDate> fromProperty() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from.set(from);
    }

    public LocalDate getTo() {
        return to.get();
    }

    public SimpleObjectProperty<LocalDate> toProperty() {
        return to;
    }

    public void setTo(LocalDate to) {
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
}
