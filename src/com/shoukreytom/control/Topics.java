package com.shoukreytom.control;

import com.shoukreytom.model.DatesValidation;
import com.shoukreytom.model.TopicsModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Topics {

    @FXML
    private BorderPane mainPane;
    @FXML
    private ListView<TopicsModel> topics;
    private ObservableList<TopicsModel> dataList;
    private Stage addStage = new Stage();

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
    public void initialize() {
        loadData();
    }

    private void loadData() {
        dataList = FXCollections.observableArrayList();
        dataList.addAll(new TopicsModel(LocalDate.now(), LocalDate.now(), "some", "this"));
        topics.getItems().addAll(dataList);
    }

    @FXML
    public void add() throws Exception{
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
        if (addStage != null) {
            addStage.close();
            System.out.println("Can be cancelled");
        }else {
            System.out.println(addStage);
        }
    }

}
