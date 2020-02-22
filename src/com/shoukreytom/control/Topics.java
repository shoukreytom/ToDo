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
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.time.LocalDate;

public class Topics {

    @FXML
    private ListView<TopicsModel> topics;
    private ObservableList<TopicsModel> dataList;
    private Stage addStage = new Stage();

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

}
