package com.shoukreytom.control;

import com.shoukreytom.Main;
import com.shoukreytom.model.DBConnection;
import com.shoukreytom.model.TopicsModel;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class Topics {

    @FXML
    private BorderPane mainPane;
    @FXML
    private ListView<TopicsModel> topics;
    @FXML
    private Label dateScreen;
    @FXML
    private TextArea descriptionScreen;

    private ObservableList<TopicsModel> dataList;

    @FXML
    public void initialize() {
        loadData();
    }

    private void loadData() {
//        try {
//            Connection con = DBConnection.getConnection();
//            PreparedStatement ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS topics(int id)");
//        }catch (SQLException e) {
//            System.out.println(e.getErrorCode());
//        }
        dataList = FXCollections.observableArrayList();
        dataList.addAll(new TopicsModel(LocalDate.now(), LocalDate.now(), "some", "this"),
                new TopicsModel(LocalDate.now(), LocalDate.now(), "new", "some"),
                new TopicsModel(LocalDate.now(), LocalDate.now(), "Thing", "view"));
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
        topics.getItems().addAll(dataList);
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
