package com.shoukreytom.control;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Topics {

    @FXML
    private BorderPane mainPane;
    private Stage addStage;

    //////////// For addTopic.fxml ////////////////
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
    public void add() throws Exception{
        addStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/fxml/addTopic.fxml"));
        addStage.setScene(new Scene(root));
        addStage.setTitle("Add");
        addStage.show();
    }

    @FXML
    public void del() {
        // code to delete an item from list view
    }

    @FXML
    public void edit() {
        Stage stage = new Stage();
        stage.show();
    }

    @FXML
    public void home() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/fxml/home.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    ////////////////// Control For addTopic.fxml /////////////////////

    @FXML
    public void addTopic() {
        ///// adds topic to the db
        LocalDate fromDate = this.from.getValue();
        LocalDate toDate = this.to.getValue();
        String topic = this.topic.getText();
        String description = this.description.getText();

        // these lines are made just for reducing the length of if statement
        boolean nullCheck = fromDate != null && toDate != null;
        boolean yearEquality = nullCheck && fromDate.getYear() == toDate.getYear();
        boolean monthEquality = nullCheck && fromDate.getMonthValue() == toDate.getMonthValue();
        boolean yearValid = nullCheck && (fromDate.getYear() < toDate.getYear());
        boolean monthValid = nullCheck && (fromDate.getMonthValue() < toDate.getMonthValue());
        boolean dayValid = nullCheck && (fromDate.getDayOfMonth() < toDate.getDayOfMonth());

        if (yearValid) {
            System.out.println("valid");
        } else if (yearEquality && monthValid) {
            System.out.println("valid");
        } else if (yearEquality && monthEquality && dayValid) {
            System.out.println("valid");
        }else {
            System.out.println("not valid");
        }
    }
    @FXML
    public void cancel() {
        //// cancel the action
        if (addStage != null) {
            System.out.println("Can be cancelled");
        }
    }

}
