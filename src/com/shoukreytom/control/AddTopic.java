package com.shoukreytom.control;

import com.shoukreytom.model.DatesValidation;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.time.LocalDate;

public class AddTopic {

    //////////// For addTopic.fxml ////////////////
    @FXML
    private GridPane pane;
    @FXML
    private DatePicker from;
    @FXML
    private DatePicker to;
    @FXML
    private TextField topic;
    @FXML
    private TextArea description;
    @FXML
    private Label errorMSG;
    ///////////////////////////////////////////////////

    @FXML
    public void addTopic() {
        ///// adds topic to the db
        LocalDate fromDate = this.from.getValue();
        LocalDate toDate = this.to.getValue();
        String topic = this.topic.getText();
        String description = this.description.getText();

        boolean isTopicEmpty = topic.isEmpty() || topic.trim().isEmpty();

        if (DatesValidation.validate(fromDate, toDate) && ! isTopicEmpty) {
            System.out.println("valid");
        }else {
            errorMSG.setText("Not valid");
        }
    }
    @FXML
    public void cancel() {
        //// cancel the action
    }

}
