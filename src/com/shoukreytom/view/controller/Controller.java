package com.shoukreytom.view.controller;

import com.shoukreytom.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {

    @FXML
    public void topics() throws Exception{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/view/fxml/topics.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("Topics");
        stage.show();
    }
    @FXML
    public void projects() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/view/fxml/projects.fxml"));
        Main.mainWindow.setTitle("Projects");
        Main.mainWindow.setScene(new Scene(root));
    }
    @FXML
    public void reports() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/com/shoukreytom/view/fxml/reports.fxml"));
        Main.mainWindow.setTitle("Projects");
        Main.mainWindow.setScene(new Scene(root));
    }
    @FXML
    public void exit() {
        System.exit(0);
    }


}
