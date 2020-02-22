package com.shoukreytom.control;

import com.shoukreytom.Main;
import com.shoukreytom.model.TopicsModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.time.LocalDate;

public class Topics {

    @FXML
    private BorderPane mainPane;
    @FXML
    private ListView<TopicsModel> topics;
    private ObservableList<TopicsModel> dataList;

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
        Stage addStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/fxml/addTopic.fxml"));
        addStage.setScene(new Scene(root));
        addStage.setTitle("Add");
        addStage.initModality(Modality.WINDOW_MODAL);
        addStage.initOwner(mainPane.getScene().getWindow());
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
        Main.mainWindow.setScene(new Scene(root));
    }

}
