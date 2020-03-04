package com.shoukreytom.view.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Projects {

    @FXML
    private BorderPane mainPane;

    @FXML
    public void add() {
        Stage stage = new Stage();
        stage.show();
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
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
