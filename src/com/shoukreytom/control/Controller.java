package com.shoukreytom;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {

    @FXML
    public void topics() throws Exception{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/fxml/topics.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Topics");
        stage.show();
    }
    @FXML
    public void projects() throws Exception{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/fxml/projects.fxml"));
        stage.setTitle("Projects");
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    public void reports() {
        Stage stage = new Stage();
        stage.setTitle("Reports");
        stage.show();
    }
    @FXML
    public void exit() {
        System.exit(0);
    }


}
