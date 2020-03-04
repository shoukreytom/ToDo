package com.shoukreytom.view.controller;

import com.shoukreytom.Main;
import com.shoukreytom.model.LoadData;
import com.shoukreytom.model.TopicsModel;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.List;

public class Topics {

    @FXML
    private BorderPane mainPane;
    @FXML
    private ListView<TopicsModel> topics;
    @FXML
    private Label dateScreen;
    @FXML
    private TextArea descriptionScreen;

//    private ObservableList<TopicsModel> dataList;
    private Controller controller = new Controller();

    @FXML
    public void initialize() {
        loadData();
    }

    private void loadData() {
//        dataList = FXCollections.observableArrayList();
        List<TopicsModel> topicsModels = LoadData.getTopics();

        topics.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TopicsModel>() {
            @Override
            public void changed(ObservableValue<? extends TopicsModel> observable, TopicsModel oldValue, TopicsModel newValue) {
                if (newValue != null) {
                    TopicsModel tm = (TopicsModel) topics.getSelectionModel().getSelectedItem();
                    dateScreen.setText("Due: " + tm.getFrom() + " - " + tm.getTo());
                    descriptionScreen.setText(tm.getDescription());
                }
            }
        });
        topics.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        topics.getItems().setAll(topicsModels);
        topics.getSelectionModel().selectFirst();
    }

    @FXML
    public void mouseClickedAction() {
        TopicsModel tm = (TopicsModel) topics.getSelectionModel().getSelectedItem();
        dateScreen.setText("Due: " + tm.getFrom() + " - " + tm.getTo());
        descriptionScreen.setText(tm.getDescription());
    }

    @FXML
    public void add() throws Exception{
        Stage addStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/view/fxml/addTopic.fxml"));
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
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/view/fxml/home.fxml"));
        Main.mainWindow.setScene(new Scene(root));
    }

}
